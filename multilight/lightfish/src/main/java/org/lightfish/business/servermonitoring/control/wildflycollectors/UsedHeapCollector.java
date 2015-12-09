package org.lightfish.business.servermonitoring.control.wildflycollectors;

import java.io.StringReader;
import javax.json.Json;
import javax.json.JsonObject;
import javax.json.JsonReader;
import org.lightfish.business.servermonitoring.control.collectors.AbstractRestDataCollector;
import org.lightfish.business.servermonitoring.control.collectors.DataPoint;
import org.lightfish.business.servermonitoring.control.collectors.SnapshotDataCollectorWildfly;

/**
 *
 * @author michael
 */
@SnapshotDataCollectorWildfly
public class UsedHeapCollector extends AbstractRestDataCollector<Long> {

    public static final String HEAP_SIZE = "core-service/platform-mbean/type/memory/heap-memory-usage?include-runtime=true";

    @Override
    public DataPoint<Long> collect() throws Exception {
        String str = sendRequest(HEAP_SIZE);
        JsonReader jsonReader = Json.createReader(new StringReader(str));
        JsonObject object = jsonReader.readObject();
        JsonObject heap = object.getJsonObject("heap-memory-usage");
        return new DataPoint<>("usedHeap", heap.getJsonNumber("used").longValue());
    }

}
