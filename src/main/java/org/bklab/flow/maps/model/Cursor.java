package org.bklab.flow.maps.model;

public enum Cursor implements MapEnum {
    POINTER("pointer"),
    NONE("");

    private final String cursor;

    Cursor(final String cursor) {
        this.cursor = cursor;
    }

    @Override
    public String toString() {
        return this.cursor;
    }
}
