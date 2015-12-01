package org.lightfish.business.servermonitoring.control.collectors.wildfly;

import java.io.StringReader;
import java.util.ArrayList;
import java.util.List;
import javax.json.Json;
import javax.json.JsonObject;
import javax.json.JsonReader;
import org.lightfish.business.servermonitoring.control.collectors.AbstractRestDataCollector;
import org.lightfish.business.servermonitoring.control.collectors.DataPoint;
import org.lightfish.business.servermonitoring.control.collectors.SnapshotDataCollectorWildfly;
import org.lightfish.business.servermonitoring.entity.Application;

/**
 *
 * @author Rob Veldpaus
 */
@SnapshotDataCollectorWildfly
public class DeployedApplicationCollector extends AbstractRestDataCollector<List<Application>> {

    public static final String APPLICATIONS = "deployment";

    @Override
    public DataPoint<List<Application>> collect() throws Exception {
        String str = sendRequest(APPLICATIONS);
        JsonReader jsonReader = Json.createReader(new StringReader(str));
        JsonObject object = jsonReader.readObject();
        JsonObject apps = object.getJsonObject("deployment");
        List<Application> applications = new ArrayList<>();
        for (String name : apps.keySet()) {
            Application a = new Application(name, new ArrayList<String>());
            applications.add(a);
        }
        return new DataPoint<>("applications", applications);
    }

}
