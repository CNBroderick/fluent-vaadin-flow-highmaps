package org.bklab.flow.maps.events.internal;

import org.bklab.flow.maps.model.MapDataSeriesItem;
import org.bklab.flow.maps.model.Series;

public abstract class AbstractSeriesItemEvent extends AbstractSeriesEvent {
    private static final long serialVersionUID = 20141117L;
    private final MapDataSeriesItem item;
    private final Number value;

    public AbstractSeriesItemEvent(final Series series, final Number value) {
        super(series);
        if (value == null) {
            throw new IllegalArgumentException("Value may not be null");
        }
        this.value = value;
        this.item = null;
    }

    public AbstractSeriesItemEvent(final Series series, final MapDataSeriesItem item) {
        super(series);
        if (item == null) {
            throw new IllegalArgumentException("Item may not be null");
        }
        this.item = item;
        this.value = null;
    }

    public MapDataSeriesItem getItem() {
        return this.item;
    }

    public Number getValue() {
        return this.value;
    }
}
