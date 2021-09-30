package org.bklab.flow.maps.model;

import org.bklab.flow.maps.model.style.Color;

public class Crosshair extends AbstractConfigurationObject {
    private Color color;
    private DashStyle dashStyle;
    private Boolean snap;
    private Number width;
    private Number zIndex;

    public Color getColor() {
        return this.color;
    }

    public void setColor(final Color color) {
        this.color = color;
    }

    public DashStyle getDashStyle() {
        return this.dashStyle;
    }

    public void setDashStyle(final DashStyle dashStyle) {
        this.dashStyle = dashStyle;
    }

    public Boolean getSnap() {
        return this.snap;
    }

    public void setSnap(final Boolean snap) {
        this.snap = snap;
    }

    public Number getWidth() {
        return this.width;
    }

    public void setWidth(final Number width) {
        this.width = width;
    }

    public Number getZIndex() {
        return this.zIndex;
    }

    public void setZIndex(final Number zIndex) {
        this.zIndex = zIndex;
    }
}
