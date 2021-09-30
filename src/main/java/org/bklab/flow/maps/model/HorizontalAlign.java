package org.bklab.flow.maps.model;

public enum HorizontalAlign implements MapEnum {
    RIGHT("right"),
    CENTER("center"),
    LEFT("left");

    private final String align;

    HorizontalAlign(final String align) {
        this.align = align;
    }

    @Override
    public String toString() {
        return this.align;
    }
}
