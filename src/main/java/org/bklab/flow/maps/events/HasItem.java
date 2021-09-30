package org.bklab.flow.maps.events;

import org.bklab.flow.maps.HighChatsMap;
import org.bklab.flow.maps.model.MapDataSeries;
import org.bklab.flow.maps.model.MapDataSeriesItem;

public interface HasItem extends HasSeries {
    HighChatsMap getSource();

    String getCategory();

    int getItemIndex();

    default MapDataSeriesItem getItem() {
        return ((MapDataSeries) this.getSeries()).get(this.getItemIndex());
    }
}
