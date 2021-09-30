package org.bklab.flow.maps.events;

import com.vaadin.flow.component.ComponentEvent;
import com.vaadin.flow.component.DomEvent;
import com.vaadin.flow.component.EventData;
import elemental.json.JsonArray;
import org.bklab.flow.maps.HighChatsMap;

@DomEvent("chart-add-series")
public class MapAddSeriesEvent extends ComponentEvent<HighChatsMap> {
    private final String name;
    private final Number[] data;

    public MapAddSeriesEvent(final HighChatsMap source, final boolean fromClient, @EventData("event.detail.originalEvent.options.name") final String name, @EventData("event.detail.originalEvent.options.data") final JsonArray data) {
        super(source, fromClient);
        this.name = name;
        this.data = new Number[data.length()];
        for (int a = 0; a < data.length(); ++a) {
            this.data[a] = data.getObject(a).getNumber("y");
        }
    }

    public String getName() {
        return this.name;
    }

    public Number[] getData() {
        return this.data;
    }
}
