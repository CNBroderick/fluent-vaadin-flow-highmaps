package org.bklab.flow.maps.model;

import org.bklab.flow.maps.model.style.Style;

public class HTMLLabelItem extends AbstractConfigurationObject {
    private String html;
    private Style style;

    public HTMLLabelItem(final String html) {
        this.setHtml(html);
    }

    public HTMLLabelItem(final String html, final Style style) {
        this(html);
        this.setStyle(style);
    }

    public String getHtml() {
        return this.html;
    }

    public void setHtml(final String html) {
        this.html = html;
    }

    public Style getStyle() {
        return this.style;
    }

    public void setStyle(final Style style) {
        this.style = style;
    }
}
