package org.bklab.flow.maps.model;

import org.bklab.flow.maps.model.style.Color;

public class Hover extends AbstractConfigurationObject {
    private Color borderColor;
    private Number borderWidth;
    private Number brightness;
    private Color color;
    private Boolean enabled;
    private Marker marker;

    public Hover() {
    }

    public Hover(final Boolean enabled) {
        this.enabled = enabled;
    }

    public Color getBorderColor() {
        return this.borderColor;
    }

    public void setBorderColor(final Color borderColor) {
        this.borderColor = borderColor;
    }

    public Number getBorderWidth() {
        return this.borderWidth;
    }

    public void setBorderWidth(final Number borderWidth) {
        this.borderWidth = borderWidth;
    }

    public Number getBrightness() {
        return this.brightness;
    }

    public void setBrightness(final Number brightness) {
        this.brightness = brightness;
    }

    public Color getColor() {
        return this.color;
    }

    public void setColor(final Color color) {
        this.color = color;
    }

    public Boolean getEnabled() {
        return this.enabled;
    }

    public void setEnabled(final Boolean enabled) {
        this.enabled = enabled;
    }

    public Marker getMarker() {
        if (this.marker == null) {
            this.marker = new Marker();
        }
        return this.marker;
    }

    public void setMarker(final Marker marker) {
        this.marker = marker;
    }
}
