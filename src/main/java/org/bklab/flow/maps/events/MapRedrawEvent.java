package org.bklab.flow.maps.events;

import com.vaadin.flow.component.ComponentEvent;
import com.vaadin.flow.component.DomEvent;
import org.bklab.flow.maps.HighChatsMap;

@DomEvent("chart-redraw")
public class MapRedrawEvent extends ComponentEvent<HighChatsMap> {
    public MapRedrawEvent(final HighChatsMap source, final boolean fromClient) {
        super(source, fromClient);
    }
}
