package org.bklab.flow.maps.events.internal;

import org.bklab.flow.maps.model.Series;

public class SeriesAddedEvent extends AbstractSeriesEvent {
    public SeriesAddedEvent(final Series series) {
        super(series);
    }
}
