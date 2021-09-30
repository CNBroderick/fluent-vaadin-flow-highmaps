package org.bklab.flow.maps.events.internal;

import java.io.Serializable;

public interface ConfigurationChangeListener<C extends ConfigurationChangeListener<C>> extends Serializable {
    C dataAdded(final DataAddedEvent p0);

    C dataRemoved(final DataRemovedEvent p0);

    C dataUpdated(final DataUpdatedEvent p0);

    C itemSliced(final ItemSlicedEvent p0);

    C seriesStateChanged(final SeriesStateEvent p0);

    C seriesAdded(final SeriesAddedEvent p0);

    C seriesChanged(final SeriesChangedEvent p0);

    C axisRescaled(final AxisRescaledEvent p0);

    C resetZoom(final boolean p0, final boolean p1);
}
