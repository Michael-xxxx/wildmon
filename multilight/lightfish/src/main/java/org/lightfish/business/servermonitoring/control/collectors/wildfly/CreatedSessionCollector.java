package org.lightfish.business.servermonitoring.control.collectors.wildfly;

import javax.annotation.PostConstruct;
import javax.inject.Inject;
import org.lightfish.business.servermonitoring.control.collectors.AbstractRestDataCollector;
import org.lightfish.business.servermonitoring.control.collectors.DataPoint;
import org.lightfish.business.servermonitoring.control.collectors.SnapshotDataCollectorWildfly;

/**
 *
 * @author Rob Veldpaus
 */
@SnapshotDataCollectorWildfly
public class CreatedSessionCollector extends AbstractRestDataCollector<Integer> {

    @Inject
    String application;

    public String CREATED_SESSIONS_URI;

    @PostConstruct
    public void init() {
        CREATED_SESSIONS_URI = "deployment/" + application + "/subsystem/undertow?operation=attribute&name=sessions-created";

    }

    @Override
    public DataPoint<Integer> collect() throws Exception {
        String str = sendRequest(CREATED_SESSIONS_URI);
        return new DataPoint<>("expiredSessionCount", Integer.parseInt(str));
    }

}
