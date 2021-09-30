package org.bklab.flow.maps.events;

import com.vaadin.flow.component.ComponentEvent;
import com.vaadin.flow.component.DomEvent;
import com.vaadin.flow.component.EventData;
import org.bklab.flow.maps.HighChatsMap;

@DomEvent("point-remove")
public class PointRemoveEvent extends ComponentEvent<HighChatsMap> implements HasItem {
    private final int seriesIndex;
    private final String category;
    private final double x;
    private final double y;
    private final int pointIndex;

    public PointRemoveEvent(final HighChatsMap source, final boolean fromClient, @EventData("event.detail.originalEvent.target.series.index") final int seriesIndex, @EventData("event.detail.originalEvent.target.category") final String category, @EventData("event.detail.originalEvent.target.x") final double x, @EventData("event.detail.originalEvent.target.y") final double y, @EventData("event.detail.originalEvent.target.index") final int pointIndex) {
        super(source, fromClient);
        this.seriesIndex = seriesIndex;
        this.category = category;
        this.x = x;
        this.y = y;
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

    public double getxValue() {
        return this.x;
    }

    public double getyValue() {
        return this.y;
    }
}
