package org.bklab.flow.maps.model;

import org.bklab.flow.maps.model.style.ButtonTheme;
import org.bklab.flow.maps.model.style.Color;

public class ContextButton extends AbstractConfigurationObject {
    private HorizontalAlign align;
    private Boolean enabled;
    private Number height;
    private String symbol;
    private Color symbolFill;
    private Number symbolSize;
    private Color symbolStroke;
    private Number symbolStrokeWidth;
    private Number symbolX;
    private Number symbolY;
    private String text;
    private ButtonTheme theme;
    private VerticalAlign verticalAlign;
    private Number width;
    private Number x;
    private Number y;

    public ContextButton() {
    }

    public ContextButton(final Boolean enabled) {
        this.enabled = enabled;
    }

    public ContextButton(final String text) {
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

    public String getSymbol() {
        return this.symbol;
    }

    public void setSymbol(final String symbol) {
        this.symbol = symbol;
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

    public ButtonTheme getTheme() {
        if (this.theme == null) {
            this.theme = new ButtonTheme();
        }
        return this.theme;
    }

    public void setTheme(final ButtonTheme theme) {
        this.theme = theme;
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
}
