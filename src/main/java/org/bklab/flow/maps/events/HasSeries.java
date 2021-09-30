package org.bklab.flow.maps.events;

import org.bklab.flow.maps.HighChatsMap;
import org.bklab.flow.maps.model.Series;

import java.io.Serializable;

public interface HasSeries extends Serializable {
    HighChatsMap getSource();

    int getSeriesItemIndex();

    default Series getSeries() {
        return this.getSource().getConfiguration().getSeries().get(this.getSeriesItemIndex());
    }
}
