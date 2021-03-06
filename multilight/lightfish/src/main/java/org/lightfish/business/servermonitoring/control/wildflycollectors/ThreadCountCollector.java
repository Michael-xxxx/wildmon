package org.lightfish.business.servermonitoring.control.wildflycollectors;

import org.lightfish.business.servermonitoring.control.collectors.AbstractRestDataCollector;
import org.lightfish.business.servermonitoring.control.collectors.DataPoint;
import org.lightfish.business.servermonitoring.control.collectors.SnapshotDataCollectorWildfly;

/**
 *
 * @author michael
 */
@SnapshotDataCollectorWildfly
public class ThreadCountCollector extends AbstractRestDataCollector<Integer> {

    public static final String THREAD_COUNT_URI = "core-service/platform-mbean/type/threading?operation=attribute&name=thread-count";

    @Override
    public DataPoint<Integer> collect() throws Exception {
        String str = sendRequest(THREAD_COUNT_URI);
        return new DataPoint<>("threadCount", Integer.parseInt(str));
    }

}
