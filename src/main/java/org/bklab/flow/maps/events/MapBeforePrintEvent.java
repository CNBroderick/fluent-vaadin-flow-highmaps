package org.bklab.flow.maps.events;

import com.vaadin.flow.component.ComponentEvent;
import com.vaadin.flow.component.DomEvent;
import org.bklab.flow.maps.HighChatsMap;

@DomEvent("chart-before-print")
public class MapBeforePrintEvent extends ComponentEvent<HighChatsMap> {
    public MapBeforePrintEvent(final HighChatsMap source, final boolean fromClient) {
        super(source, fromClient);
    }
}
