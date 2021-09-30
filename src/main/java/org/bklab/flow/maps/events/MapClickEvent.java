package org.bklab.flow.maps.events;

import com.vaadin.flow.component.ComponentEvent;
import com.vaadin.flow.component.DomEvent;
import com.vaadin.flow.component.EventData;
import org.bklab.flow.maps.HighChatsMap;

@DomEvent("chart-click")
public class MapClickEvent extends ComponentEvent<HighChatsMap> implements ClickEvent {
    private final MouseEventDetails details;

    public MapClickEvent(final HighChatsMap source, final boolean fromClient, @EventData("event.detail.xValue") final Integer x, @EventData("event.detail.yValue") final Integer y, @EventData("event.detail.originalEvent.pageX") final int pageX, @EventData("event.detail.originalEvent.pageY") final int pageY, @EventData("event.detail.originalEvent.altKey") final boolean altKey, @EventData("event.detail.originalEvent.ctrlKey") final boolean ctrlKey, @EventData("event.detail.originalEvent.metaKey") final boolean metaKey, @EventData("event.detail.originalEvent.shiftKey") final boolean shiftKey, @EventData("event.detail.originalEvent.button") final int button) {
        super(source, fromClient);
        this.details = new MouseEventDetails();
        if (x != null) {
            this.details.setxValue(x);
        }
        if (y != null) {
            this.details.setyValue(y);
        }
        this.details.setAbsoluteX(pageX);
        this.details.setAbsoluteY(pageY);
        this.details.setButton(MouseEventDetails.MouseButton.of(button));
        this.details.setAltKey(altKey);
        this.details.setCtrlKey(ctrlKey);
        this.details.setMetaKey(metaKey);
        this.details.setShiftKey(shiftKey);
    }

    public MouseEventDetails getMouseDetails() {
        return this.details;
    }
}
