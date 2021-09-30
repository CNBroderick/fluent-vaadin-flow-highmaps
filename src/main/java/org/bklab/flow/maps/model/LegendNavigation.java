package org.bklab.flow.maps.model;

import org.bklab.flow.maps.model.style.Color;
import org.bklab.flow.maps.model.style.Style;

public class LegendNavigation extends AbstractConfigurationObject {
    private Color activeColor;
    private Boolean animation;
    private Number arrowSize;
    private Boolean enabled;
    private Color inactiveColor;
    private Style style;

    public LegendNavigation() {
    }

    public LegendNavigation(final Boolean enabled) {
        this.enabled = enabled;
    }

    public Color getActiveColor() {
        return this.activeColor;
    }

    public void setActiveColor(final Color activeColor) {
        this.activeColor = activeColor;
    }

    public Boolean getAnimation() {
        return this.animation;
    }

    public void setAnimation(final Boolean animation) {
        this.animation = animation;
    }

    public Number getArrowSize() {
        return this.arrowSize;
    }

    public void setArrowSize(final Number arrowSize) {
        this.arrowSize = arrowSize;
    }

    public Boolean getEnabled() {
        return this.enabled;
    }

    public void setEnabled(final Boolean enabled) {
        this.enabled = enabled;
    }

    public Color getInactiveColor() {
        return this.inactiveColor;
    }

    public void setInactiveColor(final Color inactiveColor) {
        this.inactiveColor = inactiveColor;
    }

    public Style getStyle() {
        if (this.style == null) {
            this.style = new Style();
        }
        return this.style;
    }

    public void setStyle(final Style style) {
        this.style = style;
    }
}
