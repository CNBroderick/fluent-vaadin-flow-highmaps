package org.bklab.flow.maps.model;

import org.bklab.flow.maps.model.style.Style;

public class Labels extends AbstractConfigurationObject {
    private HorizontalAlign align;
    private Boolean enabled;
    private String format;
    private String _fn_formatter;
    private Number staggerLines;
    private Number step;
    private Style style;
    private Boolean useHTML;
    private Number x;
    private Number y;
    private Number zIndex;
    private String overflow;
    private String rotation;

    public Labels() {
    }

    public Labels(final Boolean enabled) {
        this.enabled = enabled;
    }

    public HorizontalAlign getAlign() {
        return this.align;
    }

    public void setAlign(final HorizontalAlign align) {
        this.align = align;
    }

    public Boolean getEnabled() {
        return this.enabled;
    }

    public void setEnabled(final Boolean enabled) {
        this.enabled = enabled;
    }

    public String getFormat() {
        return this.format;
    }

    public void setFormat(final String format) {
        this.format = format;
    }

    public String getFormatter() {
        return this._fn_formatter;
    }

    public void setFormatter(final String _fn_formatter) {
        this._fn_formatter = _fn_formatter;
    }

    public Number getStaggerLines() {
        return this.staggerLines;
    }

    public void setStaggerLines(final Number staggerLines) {
        this.staggerLines = staggerLines;
    }

    public Number getStep() {
        return this.step;
    }

    public void setStep(final Number step) {
        this.step = step;
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

    public Boolean getUseHTML() {
        return this.useHTML;
    }

    public void setUseHTML(final Boolean useHTML) {
        this.useHTML = useHTML;
    }

    public Number getX() {
        return this.x;
    }

    public void setX(final Number x) {
        this.x = x;
    }

    public Number getY() {
        return this.y;
    }

    public void setY(final Number y) {
        this.y = y;
    }

    public Number getZIndex() {
        return this.zIndex;
    }

    public void setZIndex(final Number zIndex) {
        this.zIndex = zIndex;
    }

    public String getOverflow() {
        return this.overflow;
    }

    public void setOverflow(final String overflow) {
        this.overflow = overflow;
    }

    public String getRotation() {
        return this.rotation;
    }

    public void setRotation(final String rotation) {
        this.rotation = rotation;
    }

    public void setRotation(final Number rotation) {
        this.rotation = rotation + "";
    }

    public void setRotationPerpendicular() {
        this.rotation = "auto";
    }
}
