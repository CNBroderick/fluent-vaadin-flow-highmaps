package org.bklab.flow.maps.events;

import com.vaadin.flow.component.ComponentEvent;
import com.vaadin.flow.component.DomEvent;
import com.vaadin.flow.component.EventData;
import org.bklab.flow.maps.HighChatsMap;

@DomEvent("point-legend-item-click")
public class PointLegendItemClickEvent extends ComponentEvent<HighChatsMap> implements HasItem {
    private final int seriesIndex;
    private final String category;
    private final int pointIndex;

    public PointLegendItemClickEvent(final HighChatsMap source, final boolean fromClient, @EventData("event.detail.point.series.index") final int seriesIndex, @EventData("event.detail.point.category") final String category, @EventData("event.detail.point.index") final int pointIndex) {
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
