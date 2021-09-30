package org.bklab.flow.maps.events;

import com.vaadin.flow.component.ComponentEvent;
import com.vaadin.flow.component.DomEvent;
import com.vaadin.flow.component.EventData;
import org.bklab.flow.maps.HighChatsMap;

@DomEvent("series-click")
public class SeriesClickEvent extends ComponentEvent<HighChatsMap> implements ClickEvent, HasSeries {
    private final int seriesIndex;
    private final MouseEventDetails details;

    public SeriesClickEvent(final HighChatsMap source, final boolean fromClient, @EventData("event.detail.originalEvent.pageX") final int pageX, @EventData("event.detail.originalEvent.pageY") final int pageY, @EventData("event.detail.originalEvent.altKey") final boolean altKey, @EventData("event.detail.originalEvent.ctrlKey") final boolean ctrlKey, @EventData("event.detail.originalEvent.metaKey") final boolean metaKey, @EventData("event.detail.originalEvent.shiftKey") final boolean shiftKey, @EventData("event.detail.originalEvent.button") final int button, @EventData("event.detail.originalEvent.point.x") final double x, @EventData("event.detail.originalEvent.point.y") final double y, @EventData("event.detail.originalEvent.point.series.index") final int seriesIndex) {
        super(source, fromClient);
        this.seriesIndex = seriesIndex;
        (this.details = new MouseEventDetails()).setxValue(x);
        this.details.setyValue(y);
        this.details.setAbsoluteX(pageX);
        this.details.setAbsoluteY(pageY);
        this.details.setButton(MouseEventDetails.MouseButton.of(button));
        this.details.setAltKey(altKey);
        this.details.setCtrlKey(ctrlKey);
        this.details.setMetaKey(metaKey);
        this.details.setShiftKey(shiftKey);
    }

    public int getSeriesItemIndex() {
        return this.seriesIndex;
    }

    public MouseEventDetails getMouseDetails() {
        return this.details;
    }
}
