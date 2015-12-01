package org.lightfish.business.servermonitoring.control.collectors.wildfly;

import org.lightfish.business.servermonitoring.control.collectors.AbstractRestDataCollector;
import org.lightfish.business.servermonitoring.control.collectors.DataPoint;
import org.lightfish.business.servermonitoring.control.collectors.SnapshotDataCollectorWildfly;

/**
 *
 * @author Rob Veldpaus
 */
@SnapshotDataCollectorWildfly
public class ExpiredSessionCollector extends AbstractRestDataCollector<Integer> {

    public static final String CREATED_SESSIONS_URI = "deployment/Einkaufsliste.war/subsystem/undertow?operation=attribute&name=sessions-created";

    @Override
    public DataPoint<Integer> collect() throws Exception {
        String str = sendRequest(CREATED_SESSIONS_URI);
        return new DataPoint<>("expiredSessionCount", Integer.parseInt(str));
    }

}
