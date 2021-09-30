package org.bklab.flow.maps.model;

public enum TickPosition implements MapEnum {
    INSIDE("inside"),
    OUTSIDE("outside");

    private final String tickPosition;

    TickPosition(final String tickPosition) {
        this.tickPosition = tickPosition;
    }

    @Override
    public String toString() {
        return this.tickPosition;
    }
}
