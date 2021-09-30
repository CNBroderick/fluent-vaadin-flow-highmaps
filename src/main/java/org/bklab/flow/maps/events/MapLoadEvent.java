package org.bklab.flow.maps.events;

import com.vaadin.flow.component.ComponentEvent;
import com.vaadin.flow.component.DomEvent;
import org.bklab.flow.maps.HighChatsMap;

@DomEvent("chart-load")
public class MapLoadEvent extends ComponentEvent<HighChatsMap> {
    public MapLoadEvent(final HighChatsMap source, final boolean fromClient) {
        super(source, fromClient);
    }
}
