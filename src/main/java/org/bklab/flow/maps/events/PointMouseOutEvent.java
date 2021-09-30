package org.bklab.flow.maps.events;

import com.vaadin.flow.component.ComponentEvent;
import com.vaadin.flow.component.DomEvent;
import com.vaadin.flow.component.EventData;
import org.bklab.flow.maps.HighChatsMap;

@DomEvent("point-mouse-out")
public class PointMouseOutEvent extends ComponentEvent<HighChatsMap> implements HasItem {
    private final String category;
    private final int seriesIndex;
    private final int pointIndex;

    public PointMouseOutEvent(final HighChatsMap source, final boolean fromClient, @EventData("event.detail.originalEvent.target.series.index") final int seriesIndex, @EventData("event.detail.originalEvent.target.index") final int pointIndex, @EventData("event.detail.originalEvent.target.category") final String category) {
        super(source, fromClient);
        this.seriesIndex = seriesIndex;
        this.pointIndex = pointIndex;
        this.category = category;
    }

    public String getCategory() {
        return this.category;
    }

    public int getItemIndex() {
        return this.pointIndex;
    }

    public int getSeriesItemIndex() {
        return this.seriesIndex;
    }
}
