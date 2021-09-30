package org.bklab.flow.maps.events.internal;

import org.bklab.flow.maps.model.Series;

import java.io.Serializable;

public abstract class AbstractSeriesEvent implements Serializable {
    private static final long serialVersionUID = 20141117L;
    private final Series series;

    public AbstractSeriesEvent(final Series series) {
        if (series == null) {
            throw new IllegalArgumentException("Series may not be null");
        }
        this.series = series;
    }

    public Series getSeries() {
        return this.series;
    }
}
