package org.bklab.flow.maps.events.internal;

import org.bklab.flow.maps.model.Series;

public class DataRemovedEvent extends AbstractSeriesEvent {
    private static final long serialVersionUID = 20141117L;
    private final int index;

    public DataRemovedEvent(final Series series, final int index) {
        super(series);
        this.index = index;
    }

    public int getIndex() {
        return this.index;
    }
}
