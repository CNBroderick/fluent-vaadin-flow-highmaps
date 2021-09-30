package org.bklab.flow.maps.model;

import org.bklab.flow.maps.model.style.Color;
import org.bklab.flow.maps.model.style.Style;

public class Legend extends AbstractConfigurationObject {
    private HorizontalAlign align;
    private Color backgroundColor;
    private Color borderColor;
    private Number borderRadius;
    private Number borderWidth;
    private Boolean enabled;
    private Boolean floating;
    private Number itemDistance;
    private Style itemHiddenStyle;
    private Style itemHoverStyle;
    private Number itemMarginBottom;
    private Number itemMarginTop;
    private Style itemStyle;
    private Number itemWidth;
    private String labelFormat;
    private String _fn_labelFormatter;
    private LayoutDirection layout;
    private Number margin;
    private Number maxHeight;
    private LegendNavigation navigation;
    private Number padding;
    private Boolean reversed;
    private Boolean rtl;
    private Boolean shadow;
    private Number symbolHeight;
    private Number symbolPadding;
    private Number symbolRadius;
    private Number symbolWidth;
    private LegendTitle title;
    private Boolean useHTML;
    private VerticalAlign verticalAlign;
    private Number width;
    private Number x;
    private Number y;

    public Legend() {
    }

    public Legend(final Boolean enabled) {
        this.enabled = enabled;
    }

    public HorizontalAlign getAlign() {
        return this.align;
    }

    public void setAlign(final HorizontalAlign align) {
        this.align = align;
    }

    public Color getBackgroundColor() {
        return this.backgroundColor;
    }

    public void setBackgroundColor(final Color backgroundColor) {
        this.backgroundColor = backgroundColor;
    }

    public Color getBorderColor() {
        return this.borderColor;
    }

    public void setBorderColor(final Color borderColor) {
        this.borderColor = borderColor;
    }

    public Number getBorderRadius() {
        return this.borderRadius;
    }

    public void setBorderRadius(final Number borderRadius) {
        this.borderRadius = borderRadius;
    }

    public Number getBorderWidth() {
        return this.borderWidth;
    }

    public void setBorderWidth(final Number borderWidth) {
        this.borderWidth = borderWidth;
    }

    public Boolean getEnabled() {
        return this.enabled;
    }

    public void setEnabled(final Boolean enabled) {
        this.enabled = enabled;
    }

    public Boolean getFloating() {
        return this.floating;
    }

    public void setFloating(final Boolean floating) {
        this.floating = floating;
    }

    public Number getItemDistance() {
        return this.itemDistance;
    }

    public void setItemDistance(final Number itemDistance) {
        this.itemDistance = itemDistance;
    }

    public Style getItemHiddenStyle() {
        if (this.itemHiddenStyle == null) {
            this.itemHiddenStyle = new Style();
        }
        return this.itemHiddenStyle;
    }

    public void setItemHiddenStyle(final Style itemHiddenStyle) {
        this.itemHiddenStyle = itemHiddenStyle;
    }

    public Style getItemHoverStyle() {
        if (this.itemHoverStyle == null) {
            this.itemHoverStyle = new Style();
        }
        return this.itemHoverStyle;
    }

    public void setItemHoverStyle(final Style itemHoverStyle) {
        this.itemHoverStyle = itemHoverStyle;
    }

    public Number getItemMarginBottom() {
        return this.itemMarginBottom;
    }

    public void setItemMarginBottom(final Number itemMarginBottom) {
        this.itemMarginBottom = itemMarginBottom;
    }

    public Number getItemMarginTop() {
        return this.itemMarginTop;
    }

    public void setItemMarginTop(final Number itemMarginTop) {
        this.itemMarginTop = itemMarginTop;
    }

    public Style getItemStyle() {
        if (this.itemStyle == null) {
            this.itemStyle = new Style();
        }
        return this.itemStyle;
    }

    public void setItemStyle(final Style itemStyle) {
        this.itemStyle = itemStyle;
    }

    public Number getItemWidth() {
        return this.itemWidth;
    }

    public void setItemWidth(final Number itemWidth) {
        this.itemWidth = itemWidth;
    }

    public String getLabelFormat() {
        return this.labelFormat;
    }

    public void setLabelFormat(final String labelFormat) {
        this.labelFormat = labelFormat;
    }

    public String getLabelFormatter() {
        return this._fn_labelFormatter;
    }

    public void setLabelFormatter(final String _fn_labelFormatter) {
        this._fn_labelFormatter = _fn_labelFormatter;
    }

    public LayoutDirection getLayout() {
        return this.layout;
    }

    public void setLayout(final LayoutDirection layout) {
        this.layout = layout;
    }

    public Number getMargin() {
        return this.margin;
    }

    public void setMargin(final Number margin) {
        this.margin = margin;
    }

    public Number getMaxHeight() {
        return this.maxHeight;
    }

    public void setMaxHeight(final Number maxHeight) {
        this.maxHeight = maxHeight;
    }

    public LegendNavigation getNavigation() {
        if (this.navigation == null) {
            this.navigation = new LegendNavigation();
        }
        return this.navigation;
    }

    public void setNavigation(final LegendNavigation navigation) {
        this.navigation = navigation;
    }

    public Number getPadding() {
        return this.padding;
    }

    public void setPadding(final Number padding) {
        this.padding = padding;
    }

    public Boolean getReversed() {
        return this.reversed;
    }

    public void setReversed(final Boolean reversed) {
        this.reversed = reversed;
    }

    public Boolean getRtl() {
        return this.rtl;
    }

    public void setRtl(final Boolean rtl) {
        this.rtl = rtl;
    }

    public Boolean getShadow() {
        return this.shadow;
    }

    public void setShadow(final Boolean shadow) {
        this.shadow = shadow;
    }

    public Number getSymbolHeight() {
        return this.symbolHeight;
    }

    public void setSymbolHeight(final Number symbolHeight) {
        this.symbolHeight = symbolHeight;
    }

    public Number getSymbolPadding() {
        return this.symbolPadding;
    }

    public void setSymbolPadding(final Number symbolPadding) {
        this.symbolPadding = symbolPadding;
    }

    public Number getSymbolRadius() {
        return this.symbolRadius;
    }

    public void setSymbolRadius(final Number symbolRadius) {
        this.symbolRadius = symbolRadius;
    }

    public Number getSymbolWidth() {
        return this.symbolWidth;
    }

    public void setSymbolWidth(final Number symbolWidth) {
        this.symbolWidth = symbolWidth;
    }

    public LegendTitle getTitle() {
        if (this.title == null) {
            this.title = new LegendTitle();
        }
        return this.title;
    }

    public void setTitle(final LegendTitle title) {
        this.title = title;
    }

    public Boolean getUseHTML() {
        return this.useHTML;
    }

    public void setUseHTML(final Boolean useHTML) {
        this.useHTML = useHTML;
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
