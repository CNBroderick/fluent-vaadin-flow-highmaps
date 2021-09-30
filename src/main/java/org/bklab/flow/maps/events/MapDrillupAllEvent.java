package org.bklab.flow.maps.events;

import com.vaadin.flow.component.ComponentEvent;
import com.vaadin.flow.component.DomEvent;
import org.bklab.flow.maps.HighChatsMap;

@DomEvent("chart-drillupall")
public class MapDrillupAllEvent extends ComponentEvent<HighChatsMap> {
    public MapDrillupAllEvent(final HighChatsMap source, final boolean fromClient) {
        super(source, fromClient);
    }
}
