package org.bklab.flow.maps.events.internal;

import org.bklab.flow.maps.model.Series;

public class SeriesStateEvent extends AbstractSeriesEvent {
    private static final long serialVersionUID = 20141117L;
    private final boolean enabled;

    public SeriesStateEvent(final Series series, final boolean enabled) {
        super(series);
        this.enabled = enabled;
    }

    public boolean isEnabled() {
        return this.enabled;
    }
}
