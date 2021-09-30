package org.bklab.flow.maps.model;

public enum DrillUpButtonRelativeTo implements MapEnum {
    PLOTBOX("plotBox"),
    SPACINGBOX("spacingBox");

    private final String box;

    DrillUpButtonRelativeTo(final String box) {
        this.box = box;
    }

    @Override
    public String toString() {
        return this.box;
    }
}
