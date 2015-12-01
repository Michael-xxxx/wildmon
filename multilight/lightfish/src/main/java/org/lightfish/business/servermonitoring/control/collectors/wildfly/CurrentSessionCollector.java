package org.lightfish.business.servermonitoring.control.collectors.wildfly;

import org.lightfish.business.servermonitoring.control.collectors.AbstractRestDataCollector;
import org.lightfish.business.servermonitoring.control.collectors.DataPoint;
import org.lightfish.business.servermonitoring.control.collectors.SnapshotDataCollectorWildfly;

/**
 *
 * @author Rob Veldpaus
 */
@SnapshotDataCollectorWildfly
public class CurrentSessionCollector extends AbstractRestDataCollector<Integer> {

    public static final String SESSION_COUNT_URI = "deployment/Einkaufsliste.war/subsystem/undertow?operation=attribute&name=active-sessions";

    @Override
    public DataPoint<Integer> collect() throws Exception {
        String str = sendRequest(SESSION_COUNT_URI);
        return new DataPoint<>("sessionCount", Integer.parseInt(str));
    }

}
