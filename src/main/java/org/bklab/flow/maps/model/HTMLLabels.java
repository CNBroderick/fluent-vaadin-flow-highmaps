package org.bklab.flow.maps.model;

import org.bklab.flow.maps.model.style.Style;

public class HTMLLabels extends AbstractConfigurationObject {
    private HTMLLabelItem[] items;
    private Style style;

    public HTMLLabels() {
    }

    public HTMLLabels(final HTMLLabelItem... items) {
        this.setItems(items);
    }

    public HTMLLabels(final Style style, final HTMLLabelItem... items) {
        this.setItems(items);
        this.setStyle(style);
    }

    public HTMLLabelItem[] getItems() {
        return this.items;
    }

    public void setItems(final HTMLLabelItem... items) {
        this.items = items;
    }

    public Style getStyle() {
        return this.style;
    }

    public void setStyle(final Style style) {
        this.style = style;
    }
}
