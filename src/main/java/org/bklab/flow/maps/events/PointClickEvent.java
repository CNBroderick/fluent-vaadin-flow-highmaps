package org.bklab.flow.maps.events;

import com.vaadin.flow.component.ComponentEvent;
import com.vaadin.flow.component.DomEvent;
import com.vaadin.flow.component.EventData;
import org.bklab.flow.maps.HighChatsMap;

@DomEvent("point-click")
public class PointClickEvent extends ComponentEvent<HighChatsMap> implements ClickEvent, HasItem {
    private final int seriesIndex;
    private final String category;
    private final int pointIndex;
    private final MouseEventDetails details;
    private final PointProperties pointProperties;

    public PointClickEvent(final HighChatsMap source, final boolean fromClient, @EventData("event.detail.originalEvent.pageX") final int pageX, @EventData("event.detail.originalEvent.pageY") final int pageY, @EventData("event.detail.originalEvent.altKey") final boolean altKey, @EventData("event.detail.originalEvent.ctrlKey") final boolean ctrlKey, @EventData("event.detail.originalEvent.metaKey") final boolean metaKey, @EventData("event.detail.originalEvent.shiftKey") final boolean shiftKey, @EventData("event.detail.originalEvent.button") final int button, @EventData("event.detail.originalEvent.point.x") final double x, @EventData("event.detail.originalEvent.point.y") final double y, @EventData("event.detail.originalEvent.point.series.index") final int seriesIndex, @EventData("event.detail.originalEvent.point.category") final String category, @EventData("event.detail.originalEvent.point.properties && event.detail.originalEvent.point.properties.name") final String name, @EventData("event.detail.originalEvent.point.index") final int pointIndex) {
        super(source, fromClient);
        this.seriesIndex = seriesIndex;
        this.category = category;
        this.pointIndex = pointIndex;
        (this.details = new MouseEventDetails()).setxValue(x);
        this.details.setyValue(y);
        this.details.setAbsoluteX(pageX);
        this.details.setAbsoluteY(pageY);
        this.details.setButton(MouseEventDetails.MouseButton.of(button));
        this.details.setAltKey(altKey);
        this.details.setCtrlKey(ctrlKey);
        this.details.setMetaKey(metaKey);
        this.details.setShiftKey(shiftKey);
        (this.pointProperties = new PointProperties()).setName(name);
    }

    public MouseEventDetails getMouseDetails() {
        return this.details;
    }

    public int getSeriesItemIndex() {
        return this.seriesIndex;
    }

    public String getCategory() {
        return this.category;
    }

    public PointProperties getPointProperties() {
        return this.pointProperties;
    }

    public int getItemIndex() {
        return this.pointIndex;
    }
}
