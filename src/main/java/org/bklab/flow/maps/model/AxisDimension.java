package org.bklab.flow.maps.model;

public enum AxisDimension {
    X_AXIS(0),
    Y_AXIS(1),
    COLOR_AXIS(3);

    private final int index;

    AxisDimension(final int index) {
        this.index = index;
    }

    public int getIndex() {
        return this.index;
    }
}
