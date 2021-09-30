package org.bklab.flow.maps.model;

import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

@Getter
@Accessors(chain = true)
public enum Shape implements MapEnum {
    CALLOUT("callout"),
    CIRCLE("circle"),
    DIAMOND("diamond"),
    SQUARE("square"),
    TRIANGLE("triangle"),
    TRIANGLE_DOWN("triangle-down");

    private final String type;

    Shape(final String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return this.type;
    }
}
