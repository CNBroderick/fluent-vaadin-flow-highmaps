package org.bklab.flow.maps.events;

import com.vaadin.flow.component.ComponentEvent;
import com.vaadin.flow.component.DomEvent;
import com.vaadin.flow.component.EventData;
import org.bklab.flow.maps.HighChatsMap;

@DomEvent("series-legend-item-click")
public class SeriesLegendItemClickEvent extends ComponentEvent<HighChatsMap> implements ClickEvent, HasSeries {
    private final int seriesIndex;
    private final MouseEventDetails details;

    public SeriesLegendItemClickEvent(final HighChatsMap source, final boolean fromClient, @EventData("event.detail.originalEvent.browserEvent.pageX") final int pageX, @EventData("event.detail.originalEvent.browserEvent.pageY") final int pageY, @EventData("event.detail.originalEvent.browserEvent.screenX") final int screenX, @EventData("event.detail.originalEvent.browserEvent.screenY") final int screenY, @EventData("event.detail.originalEvent.browserEvent.altKey") final boolean altKey, @EventData("event.detail.originalEvent.browserEvent.ctrlKey") final boolean ctrlKey, @EventData("event.detail.originalEvent.browserEvent.metaKey") final boolean metaKey, @EventData("event.detail.originalEvent.browserEvent.shiftKey") final boolean shiftKey, @EventData("event.detail.originalEvent.browserEvent.button") final int button, @EventData("event.detail.series.index") final int seriesIndex) {
        super(source, fromClient);
        this.seriesIndex = seriesIndex;
        (this.details = new MouseEventDetails()).setAbsoluteX(pageX);
        this.details.setAbsoluteY(pageY);
        this.details.setScreenX(screenX);
        this.details.setScreenY(screenY);
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
