/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.lightfish.business.rest;

import java.io.IOException;
import java.util.logging.Logger;
import javax.enterprise.inject.Instance;
import javax.inject.Inject;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.auth.AuthScope;
import org.apache.http.auth.UsernamePasswordCredentials;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.util.EntityUtils;

/**
 *
 * @author michael
 */
public class HttpRestClient {

    @Inject
    Instance<String> location;
    @Inject
    Instance<String> password;
    @Inject
    Instance<String> username;
    private static final Logger LOG = Logger.getLogger(HttpRestClient.class.getName());

    public String sendRequest(String uri) throws IOException {

        String content = "";

        DefaultHttpClient httpclient = new DefaultHttpClient();

        httpclient.getCredentialsProvider().setCredentials(
                new AuthScope(location.get().split(":")[0], Integer.parseInt(location.get().split(":")[1])),
                new UsernamePasswordCredentials(username.get(), password.get()));

        HttpGet httpget = new HttpGet("http://" + location.get() + "/management/" + uri);

        LOG.info("executing request:" + httpget.getRequestLine());
        HttpResponse response = httpclient.execute(httpget);
        HttpEntity entity = response.getEntity();
        if (entity != null) {
            content = EntityUtils.toString(entity);
            LOG.info("Response content: " + content);
        }
        if (entity != null) {
            entity.consumeContent();
        }
        int statuscode = response.getStatusLine().getStatusCode();
        if (statuscode == 401) {
            content = "{\"" + response.getStatusLine().getReasonPhrase()
                    + "\":\"Authentication configuration missing or wrong!\"}";
        } else if (statuscode != 200) {
            content = "{\"" + response.getStatusLine().getReasonPhrase()
                    + "\":\"\"}";
        }
        httpclient.getConnectionManager().shutdown();
        return content;
    }
}
