package org.bklab.flow.maps.events.internal;

import org.bklab.flow.maps.model.MapDataSeriesItem;
import org.bklab.flow.maps.model.Series;

public class DataUpdatedEvent extends AbstractSeriesItemEvent {
    private static final long serialVersionUID = 20141117L;
    private final int pointIndex;

    public DataUpdatedEvent(final Series series, final Number value, final int pointIndex) {
        super(series, value);
        this.pointIndex = pointIndex;
    }

    public DataUpdatedEvent(final Series series, final MapDataSeriesItem item, final int pointIndex) {
        super(series, item);
        this.pointIndex = pointIndex;
    }

    public int getPointIndex() {
        return this.pointIndex;
    }
}
