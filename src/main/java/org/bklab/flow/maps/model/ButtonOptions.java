package org.bklab.flow.maps.model;

import org.bklab.flow.maps.model.style.Color;
import org.bklab.flow.maps.model.style.Style;

public class ButtonOptions extends AbstractConfigurationObject {
    private HorizontalAlign align;
    private Boolean enabled;
    private Number height;
    private Color symbolFill;
    private Number symbolSize;
    private Color symbolStroke;
    private Number symbolStrokeWidth;
    private Number symbolX;
    private Number symbolY;
    private String text;
    private VerticalAlign verticalAlign;
    private Number width;
    private Number y;
    private String alignTo;
    private Style style;
    private Number x;

    public ButtonOptions() {
    }

    public ButtonOptions(final Boolean enabled) {
        this.enabled = enabled;
    }

    public ButtonOptions(final String text) {
        this.text = text;
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

    public Number getHeight() {
        return this.height;
    }

    public void setHeight(final Number height) {
        this.height = height;
    }

    public Color getSymbolFill() {
        return this.symbolFill;
    }

    public void setSymbolFill(final Color symbolFill) {
        this.symbolFill = symbolFill;
    }

    public Number getSymbolSize() {
        return this.symbolSize;
    }

    public void setSymbolSize(final Number symbolSize) {
        this.symbolSize = symbolSize;
    }

    public Color getSymbolStroke() {
        return this.symbolStroke;
    }

    public void setSymbolStroke(final Color symbolStroke) {
        this.symbolStroke = symbolStroke;
    }

    public Number getSymbolStrokeWidth() {
        return this.symbolStrokeWidth;
    }

    public void setSymbolStrokeWidth(final Number symbolStrokeWidth) {
        this.symbolStrokeWidth = symbolStrokeWidth;
    }

    public Number getSymbolX() {
        return this.symbolX;
    }

    public void setSymbolX(final Number symbolX) {
        this.symbolX = symbolX;
    }

    public Number getSymbolY() {
        return this.symbolY;
    }

    public void setSymbolY(final Number symbolY) {
        this.symbolY = symbolY;
    }

    public String getText() {
        return this.text;
    }

    public void setText(final String text) {
        this.text = text;
    }

    public VerticalAlign getVerticalAlign() {
        return this.verticalAlign;
    }

    public void setVerticalAlign(final VerticalAlign verticalAlign) {
        this.verticalAlign = verticalAlign;
    }

    public Number getWidth() {
        return this.width;
    }

    public void setWidth(final Number width) {
        this.width = width;
    }

    public Number getY() {
        return this.y;
    }

    public void setY(final Number y) {
        this.y = y;
    }

    public String getAlignTo() {
        return this.alignTo;
    }

    public void setAlignTo(final String alignTo) {
        this.alignTo = alignTo;
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

    public Number getX() {
        return this.x;
    }

    public void setX(final Number x) {
        this.x = x;
    }
}
