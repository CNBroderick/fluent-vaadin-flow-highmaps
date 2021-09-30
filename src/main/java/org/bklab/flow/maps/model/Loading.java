package org.bklab.flow.maps.model;

import org.bklab.flow.maps.model.style.Style;

public class Loading extends AbstractConfigurationObject {
    private Number hideDuration;
    private Style labelStyle;
    private Number showDuration;
    private Style style;

    public Number getHideDuration() {
        return this.hideDuration;
    }

    public void setHideDuration(final Number hideDuration) {
        this.hideDuration = hideDuration;
    }

    public Style getLabelStyle() {
        if (this.labelStyle == null) {
            this.labelStyle = new Style();
        }
        return this.labelStyle;
    }

    public void setLabelStyle(final Style labelStyle) {
        this.labelStyle = labelStyle;
    }

    public Number getShowDuration() {
        return this.showDuration;
    }

    public void setShowDuration(final Number showDuration) {
        this.showDuration = showDuration;
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
