package org.bklab.flow.maps.events;

import com.vaadin.flow.component.ComponentEvent;
import com.vaadin.flow.component.DomEvent;
import com.vaadin.flow.component.EventData;
import org.bklab.flow.maps.HighChatsMap;

@DomEvent("point-select")
public class PointSelectEvent extends ComponentEvent<HighChatsMap> implements HasItem {
    private final int seriesIndex;
    private final String category;
    private final int pointIndex;

    public PointSelectEvent(final HighChatsMap source, final boolean fromClient, @EventData("event.detail.originalEvent.target.series.index") final int seriesIndex, @EventData("event.detail.originalEvent.target.category") final String category, @EventData("event.detail.originalEvent.target.index") final int pointIndex) {
        super(source, fromClient);
        this.seriesIndex = seriesIndex;
        this.category = category;
        this.pointIndex = pointIndex;
    }

    public int getSeriesItemIndex() {
        return this.seriesIndex;
    }

    public String getCategory() {
        return this.category;
    }

    public int getItemIndex() {
        return this.pointIndex;
    }
}
