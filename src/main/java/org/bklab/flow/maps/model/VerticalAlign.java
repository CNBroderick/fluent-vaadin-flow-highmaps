package org.bklab.flow.maps.model;

public enum VerticalAlign implements MapEnum {
    BOTTOM("bottom"),
    LOW("low"),
    MIDDLE("middle"),
    HIGH("high"),
    TOP("top");

    private final String align;

    VerticalAlign(final String align) {
        this.align = align;
    }

    @Override
    public String toString() {
        return this.align;
    }
}
