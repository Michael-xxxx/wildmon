package org.lightfish.business.servermonitoring.control;

import java.io.IOException;
import java.io.StringReader;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.enterprise.inject.Instance;
import javax.inject.Inject;
import javax.json.Json;
import javax.json.JsonObject;
import javax.json.JsonReader;
import javax.ws.rs.client.Client;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;
import org.lightfish.business.authenticator.GlassfishAuthenticator;
import org.lightfish.business.rest.HttpRestClient;
import org.lightfish.business.servermonitoring.entity.OneShot;

/**
 * User: blog.adam-bien.com Date: 30.01.12 Time: 19:40
 */
public class OneShotProvider {

    @Inject
    protected Client client;
    @Inject
    String location;
    @Inject
    String username;
    @Inject
    String password;
    @Inject
    Instance<GlassfishAuthenticator> authenticator;
    private WebTarget managementResource;
    @Inject
    HttpRestClient httpRestClient;

    private Logger LOG = Logger.getLogger(OneShotProvider.class.getName());

    String getVersion() {
        try {
            String str = httpRestClient.sendRequest("");
            JsonReader jsonReader = Json.createReader(new StringReader(str));
            JsonObject object = jsonReader.readObject();
            return object.getString("release-version") + " " + object.getString("release-codename");
        } catch (IOException ex) {
            Logger.getLogger(OneShotProvider.class.getName()).log(Level.SEVERE, null, ex);
        }
        return "-";
    }

    String getUpTime() {
        String uri = "core-service/platform-mbean/type/runtime?recursive=true&include-runtime=true";
        try {
            String str = httpRestClient.sendRequest(uri);
            JsonReader jsonReader = Json.createReader(new StringReader(str));
            JsonObject object = jsonReader.readObject();
            int uptime = object.getInt("start-time");
            return new Date(uptime).toString();
        } catch (IOException ex) {
            Logger.getLogger(OneShotProvider.class.getName()).log(Level.SEVERE, null, ex);
        }
        return "-";
    }

    JsonObject getJsonObject(String name) {
        return this.managementResource.path(name).request(MediaType.APPLICATION_JSON).get(JsonObject.class);
    }

    String getManagementURI() {
        return getProtocol() + location + "/management/";
    }

    public OneShot fetchOneShot() {
        //TODO migrate authenticator
        //authenticator.get().addAuthenticator(client, username.get(), password.get());
        String version = null;
        String uptime = null;
        try {
            version = getVersion();
            uptime = getUpTime();
        } catch (Exception e) {
            throw new IllegalStateException("Cannot fetch static monitoring data because of: " + e);
        }
        return new OneShot.Builder().version(version).uptime(uptime).build();
    }

    private String getProtocol() {
        String protocol = "http://";
        if (username != null && username != null && !username.equals("")) {
            protocol = "http://";
            LOG.info("User name is not empty, returning https");
        } else {
            LOG.info("Using " + protocol);
        }
        return protocol;
    }

}
