package org.bklab.flow.maps.events.internal;

import org.bklab.flow.maps.model.MapDataSeriesItem;
import org.bklab.flow.maps.model.Series;

public class DataAddedEvent extends AbstractSeriesItemEvent {
    private static final long serialVersionUID = 20141117L;
    private final boolean shift;

    public DataAddedEvent(final Series series, final Number value) {
        super(series, value);
        this.shift = false;
    }

    public DataAddedEvent(final Series series, final MapDataSeriesItem item, final boolean shift) {
        super(series, item);
        this.shift = shift;
    }

    public boolean isShift() {
        return this.shift;
    }
}
