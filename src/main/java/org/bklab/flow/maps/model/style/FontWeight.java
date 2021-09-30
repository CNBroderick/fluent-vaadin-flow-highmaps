package org.bklab.flow.maps.model.style;

import org.bklab.flow.maps.model.MapEnum;

public enum FontWeight implements MapEnum {
    NORMAL("normal"),
    BOLD("bold");

    private final String type;

    FontWeight(final String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return this.type;
    }
}
