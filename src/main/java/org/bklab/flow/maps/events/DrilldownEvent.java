package org.bklab.flow.maps.events;

import com.vaadin.flow.component.ComponentEvent;
import com.vaadin.flow.component.DomEvent;
import com.vaadin.flow.component.EventData;
import org.bklab.flow.maps.HighChatsMap;

@DomEvent("chart-drilldown")
public class DrilldownEvent extends ComponentEvent<HighChatsMap> implements HasItem {
    private final String drilldown;
    private final String category;
    private final Double x;
    private final Double y;
    private final int pointIndex;
    private final int seriesIndex;
    private String pointId;

    public DrilldownEvent(final HighChatsMap source, final boolean fromClient, @EventData("event.detail.originalEvent.point.drilldown") final String drilldown, @EventData("event.detail.originalEvent.point.category") final String category, @EventData("event.detail.originalEvent.point.x") final Double x, @EventData("event.detail.originalEvent.point.y") final Double y, @EventData("event.detail.originalEvent.point.index") final int pointIndex, @EventData("event.detail.originalEvent.point.series.index") final int seriesIndex, @EventData("event.detail.originalEvent.point.id") final String pointId) {
        super(source, fromClient);
        this.drilldown = drilldown;
        this.category = category;
        this.x = x;
        this.y = y;
        this.pointIndex = pointIndex;
        this.seriesIndex = seriesIndex;
        this.pointId = pointId;
    }

    public String getDrilldown() {
        return this.drilldown;
    }

    public Double getxValue() {
        return this.x;
    }

    public Double getyValue() {
        return this.y;
    }

    public String getCategory() {
        return this.category;
    }

    public int getSeriesItemIndex() {
        return this.seriesIndex;
    }

    public int getItemIndex() {
        return this.pointIndex;
    }

    public String getPointId() {
        return this.pointId;
    }

    public DrilldownEvent setPointId(final String pointId) {
        this.pointId = pointId;
        return this;
    }
}
