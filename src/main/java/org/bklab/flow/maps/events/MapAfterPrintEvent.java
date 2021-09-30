package org.bklab.flow.maps.events;

import com.vaadin.flow.component.ComponentEvent;
import com.vaadin.flow.component.DomEvent;
import org.bklab.flow.maps.HighChatsMap;

@DomEvent("chart-after-print")
public class MapAfterPrintEvent extends ComponentEvent<HighChatsMap> {
    public MapAfterPrintEvent(final HighChatsMap source, final boolean fromClient) {
        super(source, fromClient);
    }
}
