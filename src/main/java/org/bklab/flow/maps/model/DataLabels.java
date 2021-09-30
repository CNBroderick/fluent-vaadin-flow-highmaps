package org.bklab.flow.maps.model;

import org.bklab.flow.maps.model.style.Color;
import org.bklab.flow.maps.model.style.Style;

public class DataLabels extends AbstractDataLabels {
    private HorizontalAlign align;
    private Boolean allowOverlap;
    private Color backgroundColor;
    private Color borderColor;
    private Number borderRadius;
    private Number borderWidth;
    private Color color;
    private Boolean crop;
    private Boolean enabled;
    private String format;
    private String _fn_formatter;
    private String overflow;
    private Number padding;
    private Number rotation;
    private Boolean shadow;
    private Shape shape;
    private Style style;
    private Boolean useHTML;
    private VerticalAlign verticalAlign;
    private Number x;
    private Number y;
    private Number zIndex;

    public DataLabels() {
    }

    public DataLabels(final Boolean enabled) {
        this.enabled = enabled;
    }

    public HorizontalAlign getAlign() {
        return this.align;
    }

    public void setAlign(final HorizontalAlign align) {
        this.align = align;
    }

    public Boolean getAllowOverlap() {
        return this.allowOverlap;
    }

    public void setAllowOverlap(final Boolean allowOverlap) {
        this.allowOverlap = allowOverlap;
    }

    @Override
    public Color getBackgroundColor() {
        return this.backgroundColor;
    }

    @Override
    public void setBackgroundColor(final Color backgroundColor) {
        this.backgroundColor = backgroundColor;
    }

    @Override
    public Color getBorderColor() {
        return this.borderColor;
    }

    @Override
    public void setBorderColor(final Color borderColor) {
        this.borderColor = borderColor;
    }

    @Override
    public Number getBorderRadius() {
        return this.borderRadius;
    }

    @Override
    public void setBorderRadius(final Number borderRadius) {
        this.borderRadius = borderRadius;
    }

    @Override
    public Number getBorderWidth() {
        return this.borderWidth;
    }

    @Override
    public void setBorderWidth(final Number borderWidth) {
        this.borderWidth = borderWidth;
    }

    @Override
    public Color getColor() {
        return this.color;
    }

    @Override
    public void setColor(final Color color) {
        this.color = color;
    }

    @Override
    public Boolean getCrop() {
        return this.crop;
    }

    @Override
    public void setCrop(final Boolean crop) {
        this.crop = crop;
    }

    public Boolean getEnabled() {
        return this.enabled;
    }

    @Override
    public void setEnabled(final Boolean enabled) {
        this.enabled = enabled;
    }

    @Override
    public String getFormat() {
        return this.format;
    }

    @Override
    public void setFormat(final String format) {
        this.format = format;
    }

    @Override
    public String getFormatter() {
        return this._fn_formatter;
    }

    @Override
    public void setFormatter(final String _fn_formatter) {
        this._fn_formatter = _fn_formatter;
    }

    @Override
    public String getOverflow() {
        return this.overflow;
    }

    @Override
    public void setOverflow(final String overflow) {
        this.overflow = overflow;
    }

    @Override
    public Number getPadding() {
        return this.padding;
    }

    @Override
    public void setPadding(final Number padding) {
        this.padding = padding;
    }

    @Override
    public Number getRotation() {
        return this.rotation;
    }

    @Override
    public void setRotation(final Number rotation) {
        this.rotation = rotation;
    }

    @Override
    public Boolean getShadow() {
        return this.shadow;
    }

    @Override
    public void setShadow(final Boolean shadow) {
        this.shadow = shadow;
    }

    @Override
    public Shape getShape() {
        return this.shape;
    }

    @Override
    public void setShape(final Shape shape) {
        this.shape = shape;
    }

    @Override
    public Style getStyle() {
        if (this.style == null) {
            this.style = new Style();
        }
        return this.style;
    }

    @Override
    public void setStyle(final Style style) {
        this.style = style;
    }

    @Override
    public Boolean getUseHTML() {
        return this.useHTML;
    }

    @Override
    public void setUseHTML(final Boolean useHTML) {
        this.useHTML = useHTML;
    }

    @Override
    public VerticalAlign getVerticalAlign() {
        return this.verticalAlign;
    }

    @Override
    public void setVerticalAlign(final VerticalAlign verticalAlign) {
        this.verticalAlign = verticalAlign;
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
}
