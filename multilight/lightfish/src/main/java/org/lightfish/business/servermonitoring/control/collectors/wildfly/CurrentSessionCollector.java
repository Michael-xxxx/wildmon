package org.lightfish.business.servermonitoring.control.collectors.wildfly;

import javax.annotation.PostConstruct;
import javax.inject.Inject;
import org.lightfish.business.servermonitoring.control.collectors.AbstractRestDataCollector;
import org.lightfish.business.servermonitoring.control.collectors.DataPoint;
import org.lightfish.business.servermonitoring.control.collectors.SnapshotDataCollectorWildfly;

/**
 *
 * @author michael
 */
@SnapshotDataCollectorWildfly
public class CurrentSessionCollector extends AbstractRestDataCollector<Integer> {

    @Inject
    String application;

    private String SESSION_COUNT_URI;

    @PostConstruct
    public void init() {
        SESSION_COUNT_URI = "deployment/" + application + "/subsystem/undertow?operation=attribute&name=sessions-created";

    }

    @Override
    public DataPoint<Integer> collect() throws Exception {
        String str = sendRequest(SESSION_COUNT_URI);
        return new DataPoint<>("sessionCount", Integer.parseInt(str));
    }

}
