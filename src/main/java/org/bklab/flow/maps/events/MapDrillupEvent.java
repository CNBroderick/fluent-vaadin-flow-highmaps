package org.bklab.flow.maps.events;

import com.vaadin.flow.component.ComponentEvent;
import com.vaadin.flow.component.DomEvent;
import org.bklab.flow.maps.HighChatsMap;

@DomEvent("chart-drillup")
public class MapDrillupEvent extends ComponentEvent<HighChatsMap> {
    public MapDrillupEvent(final HighChatsMap source, final boolean fromClient) {
        super(source, fromClient);
    }
}
