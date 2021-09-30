package org.bklab.flow.maps.events;

import com.vaadin.flow.component.ComponentEvent;
import com.vaadin.flow.component.DomEvent;
import com.vaadin.flow.component.EventData;
import org.bklab.flow.maps.HighChatsMap;

@DomEvent("chart-selection")
public class MapSelectionEvent extends ComponentEvent<HighChatsMap> {
    private final Double selectionStart;
    private final Double selectionEnd;
    private final Double valueStart;
    private final Double valueEnd;

    public MapSelectionEvent(final HighChatsMap source, final boolean fromClient, @EventData("event.detail.xAxisMin") final Double selectionStart, @EventData("event.detail.xAxisMax") final Double selectionEnd, @EventData("event.detail.yAxisMin") final Double valueStart, @EventData("event.detail.yAxisMax") final Double valueEnd) {
        super(source, fromClient);
        this.selectionStart = selectionStart;
        this.selectionEnd = selectionEnd;
        this.valueStart = valueStart;
        this.valueEnd = valueEnd;
    }

    public Double getSelectionStart() {
        return this.selectionStart;
    }

    public Double getSelectionEnd() {
        return this.selectionEnd;
    }

    public Double getValueStart() {
        return this.valueStart;
    }

    public Double getValueEnd() {
        return this.valueEnd;
    }
}
