package org.bklab.flow.maps.events;

import org.bklab.flow.maps.HighChatsMap;

import java.io.Serializable;

public interface HasAxis<T> extends Serializable {
    HighChatsMap getSource();

    int getAxisIndex();

    T getAxis();
}
