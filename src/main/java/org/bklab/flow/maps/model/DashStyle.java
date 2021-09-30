package org.bklab.flow.maps.model;

public enum DashStyle implements MapEnum {
    SOLID("Solid"),
    SHORTDASH("ShortDash"),
    SHORTDOT("ShortDot"),
    SHORTDASHDOT("ShortDashDot"),
    SHORTDASHDOTDOT("ShortDashDotDot"),
    DOT("Dot"),
    DASH("Dash"),
    LONGDASH("LongDash"),
    DASHDOT("DashDot"),
    LONGDASHDOT("LongDashDot"),
    LONGDASHDOTDOT("LongDashDotDot");

    private final String type;

    DashStyle(final String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return this.type;
    }
}
