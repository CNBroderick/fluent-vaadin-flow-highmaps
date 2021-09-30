package org.bklab.flow.maps.events;

import java.io.Serializable;

public class PointProperties implements Serializable {
    private String name;

    public String getName() {
        return this.name;
    }

    public void setName(final String name) {
        this.name = name;
    }
}
