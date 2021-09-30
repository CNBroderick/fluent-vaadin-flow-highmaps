package org.bklab.flow.maps.events;

import com.vaadin.flow.component.ComponentEvent;
import com.vaadin.flow.component.DomEvent;
import com.vaadin.flow.component.EventData;
import org.bklab.flow.maps.HighChatsMap;

@DomEvent("point-update")
public class PointUpdateEvent extends ComponentEvent<HighChatsMap> implements HasItem {
    private final int seriesIndex;
    private final String category;
    private final Double oldXValue;
    private final Double oldYValue;
    private final Double newXValue;
    private final Double newYValue;
    private final int pointIndex;

    public PointUpdateEvent(final HighChatsMap source, final boolean fromClient, @EventData("event.detail.originalEvent.target.series.index") final int seriesIndex, @EventData("event.detail.originalEvent.target.category") final String category, @EventData("event.detail.originalEvent.target.index") final int pointIndex, @EventData("event.detail.originalEvent.target.x") final Double oldXValue, @EventData("event.detail.originalEvent.target.y") final Double oldYValue, @EventData("event.detail.originalEvent.options.x") final Double newXValue, @EventData("event.detail.originalEvent.options.y") final Double newYValue) {
        super(source, fromClient);
        this.seriesIndex = seriesIndex;
        this.category = category;
        this.oldXValue = oldXValue;
        this.oldYValue = oldYValue;
        this.newXValue = newXValue;
        this.newYValue = newYValue;
        this.pointIndex = pointIndex;
    }

    public Double getOldXValue() {
        return this.oldXValue;
    }

    public Double getOldYValue() {
        return this.oldYValue;
    }

    public Double getxValue() {
        return this.newXValue;
    }

    public Double getyValue() {
        return this.newYValue;
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
