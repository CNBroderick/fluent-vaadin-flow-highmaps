package org.bklab.flow.maps.model.style;

import org.bklab.flow.maps.model.MapEnum;

public enum StylePosition implements MapEnum {
    ABSOLUTE("absolute"),
    RELATIVE("relative");

    private final String position;

    StylePosition(final String position) {
        this.position = position;
    }

    @Override
    public String toString() {
        return this.position;
    }
}
