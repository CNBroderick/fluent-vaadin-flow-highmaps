package org.bklab.flow.maps.events;

import com.vaadin.flow.component.ComponentEvent;
import com.vaadin.flow.component.DomEvent;
import com.vaadin.flow.component.EventData;
import org.bklab.flow.maps.HighChatsMap;

@DomEvent("series-show")
public class SeriesShowEvent extends ComponentEvent<HighChatsMap> implements HasSeries {
    private final int seriesIndex;

    public SeriesShowEvent(final HighChatsMap source, final boolean fromClient, @EventData("event.detail.originalEvent.target.index") final int seriesIndex) {
        super(source, fromClient);
        this.seriesIndex = seriesIndex;
    }

    public int getSeriesItemIndex() {
        return this.seriesIndex;
    }
}
