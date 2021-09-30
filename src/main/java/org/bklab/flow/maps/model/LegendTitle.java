package org.bklab.flow.maps.model;

import org.bklab.flow.maps.model.style.Style;

public class LegendTitle extends AbstractConfigurationObject {
    private Style style;
    private String text;

    public LegendTitle() {
    }

    public LegendTitle(final String text) {
        this.text = text;
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

    public String getText() {
        return this.text;
    }

    public void setText(final String text) {
        this.text = text;
    }
}
