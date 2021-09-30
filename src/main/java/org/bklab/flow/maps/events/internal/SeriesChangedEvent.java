package org.bklab.flow.maps.events.internal;

import org.bklab.flow.maps.model.Series;

public class SeriesChangedEvent extends AbstractSeriesEvent {
    public SeriesChangedEvent(final Series series) {
        super(series);
    }
}
