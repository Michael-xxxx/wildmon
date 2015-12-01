package org.lightfish.business.servermonitoring.control.collectors.wildfly;

import org.lightfish.business.servermonitoring.control.collectors.AbstractRestDataCollector;
import org.lightfish.business.servermonitoring.control.collectors.DataPoint;
import org.lightfish.business.servermonitoring.control.collectors.SnapshotDataCollectorWildfly;

/**
 *
 * @author michael
 */
@SnapshotDataCollectorWildfly
public class PeakThreadCountCollector extends AbstractRestDataCollector<Integer> {

    public static final String PEAK_THREAD_COUNT_URI = "core-service/platform-mbean/type/threading?operation=attribute&name=peak-thread-count";

    @Override
    public DataPoint<Integer> collect() throws Exception {
        String str = sendRequest(PEAK_THREAD_COUNT_URI);
        return new DataPoint<>("peakThreadCount", Integer.parseInt(str));
    }

}
