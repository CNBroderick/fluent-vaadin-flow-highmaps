package org.bklab.flow.maps.events;

import com.vaadin.flow.component.ComponentEvent;
import com.vaadin.flow.component.DomEvent;
import com.vaadin.flow.component.EventData;
import org.bklab.flow.maps.HighChatsMap;

@DomEvent("series-checkbox-click")
public class SeriesCheckboxClickEvent extends ComponentEvent<HighChatsMap> implements HasSeries {
    private final boolean checked;
    private final int seriesIndex;

    public SeriesCheckboxClickEvent(final HighChatsMap source, final boolean fromClient, @EventData("event.detail.originalEvent.checked") final boolean isChecked, @EventData("event.detail.originalEvent.item.index") final int seriesIndex) {
        super(source, fromClient);
        this.checked = isChecked;
        this.seriesIndex = seriesIndex;
    }

    public boolean isChecked() {
        return this.checked;
    }

    public int getSeriesItemIndex() {
        return this.seriesIndex;
    }
}
