package org.bklab.flow.maps.model;

public enum LayoutDirection implements MapEnum {
    VERTICAL("vertical"),
    HORIZONTAL("horizontal");

    private final String type;

    LayoutDirection(final String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return this.type;
    }
}
