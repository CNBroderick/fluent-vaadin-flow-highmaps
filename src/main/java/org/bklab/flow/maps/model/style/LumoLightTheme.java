package org.bklab.flow.maps.model.style;

import org.bklab.flow.maps.model.AbstractDataLabels;

public class LumoLightTheme extends Theme {
    protected static final int BORDER_RADIUS = 5;
    protected static final SolidColor COLOR1;
    protected static final SolidColor COLOR2;
    protected static final SolidColor COLOR3;
    protected static final SolidColor COLOR4;
    protected static final SolidColor COLOR5;
    protected static final SolidColor COLOR6;
    protected static final SolidColor COLOR7;
    protected static final SolidColor COLOR8;
    protected static final SolidColor COLOR9;
    protected static final SolidColor COLOR10;
    protected static final SolidColor COLOR11;
    protected static final SolidColor COLOR12;
    protected static final SolidColor COLOR13;
    protected static final SolidColor COLOR14;
    protected static final SolidColor COLOR15;
    protected static final SolidColor COLOR16;
    protected static final SolidColor TITLE_COLOR;
    protected static final SolidColor TOOLTIP_TEXT_COLOR;
    protected static final SolidColor TOOLTIP_BACKGROUND_COLOR;
    protected static final SolidColor SUBTITLE_COLOR;
    protected static final SolidColor LINE_COLOR;
    protected static final SolidColor TEXT_COLOR;
    protected static final SolidColor GRID_COLOR;
    protected static final SolidColor LABEL_COLOR;
    protected static final SolidColor BGCOLOR;
    protected static final SolidColor BGCOLOR_LIGHT_GRAY;
    protected static final SolidColor TRANSPARENT_COLOR;
    protected static final SolidColor NULL_COLOR;
    protected static final String DEFAULT_FONT_FAMILIES = "Open Sans, Helvetica Neue, Arial, sans-serif";
    protected static final Color LEGEND_TEXT_COLOR;
    protected static final Color LEGEND_BACKGROUND_COLOR;

    static {
        COLOR1 = new SolidColor(48, 144, 240);
        COLOR2 = new SolidColor(236, 100, 100);
        COLOR3 = new SolidColor(152, 223, 88);
        COLOR4 = new SolidColor(249, 221, 81);
        COLOR5 = new SolidColor(36, 220, 212);
        COLOR6 = new SolidColor(236, 100, 165);
        COLOR7 = new SolidColor(104, 92, 176);
        COLOR8 = new SolidColor(255, 125, 66);
        COLOR9 = new SolidColor(51, 97, 144);
        COLOR10 = new SolidColor(170, 81, 77);
        COLOR11 = new SolidColor(127, 176, 83);
        COLOR12 = new SolidColor(187, 168, 91);
        COLOR13 = new SolidColor(36, 121, 129);
        COLOR14 = new SolidColor(150, 57, 112);
        COLOR15 = new SolidColor(75, 86, 168);
        COLOR16 = new SolidColor(154, 89, 61);
        TITLE_COLOR = new SolidColor(25, 125, 225);
        TOOLTIP_TEXT_COLOR = new SolidColor(51, 51, 51);
        TOOLTIP_BACKGROUND_COLOR = new SolidColor(255, 255, 255);
        SUBTITLE_COLOR = new SolidColor(128, 128, 128);
        LINE_COLOR = new SolidColor(223, 223, 223);
        TEXT_COLOR = new SolidColor(128, 128, 128);
        GRID_COLOR = new SolidColor(250, 250, 250);
        LABEL_COLOR = new SolidColor(128, 128, 128);
        BGCOLOR = new SolidColor(255, 255, 255);
        BGCOLOR_LIGHT_GRAY = new SolidColor(0, 0, 0, 0.02);
        TRANSPARENT_COLOR = new SolidColor(255, 255, 255, 0.0);
        NULL_COLOR = new SolidColor(128, 128, 128, 0.1);
        LEGEND_TEXT_COLOR = new SolidColor(128, 128, 128);
        LEGEND_BACKGROUND_COLOR = new SolidColor(255, 255, 255, 0.9);
    }

    public LumoLightTheme() {
        this.setColors(LumoLightTheme.COLOR1, LumoLightTheme.COLOR2, LumoLightTheme.COLOR3, LumoLightTheme.COLOR4, LumoLightTheme.COLOR5, LumoLightTheme.COLOR6, LumoLightTheme.COLOR7, LumoLightTheme.COLOR8, LumoLightTheme.COLOR9, LumoLightTheme.COLOR10, LumoLightTheme.COLOR11, LumoLightTheme.COLOR12, LumoLightTheme.COLOR13, LumoLightTheme.COLOR14, LumoLightTheme.COLOR15, LumoLightTheme.COLOR16);
        final Style style = new Style();
        style.setFontFamily("Open Sans, Helvetica Neue, Arial, sans-serif");
        style.setFontSize("14px");
        this.getChart().setStyle(style);
        this.getTitle().setColor(LumoLightTheme.TITLE_COLOR);
        this.getTitle().setFontSize("26px");
        this.getTitle().setFontWeight(FontWeight.NORMAL);
        this.getSubtitle().setColor(LumoLightTheme.SUBTITLE_COLOR);
        this.getSubtitle().setFontWeight(FontWeight.NORMAL);
        this.getSubtitle().setFontSize("14px");
        this.getChart().setClassName("vaadin-map");
        this.getChart().setPlotBackgroundColor(LumoLightTheme.TRANSPARENT_COLOR);
        this.getChart().setPlotBackgroundImage("");
        this.getChart().setPlotBorderColor(LumoLightTheme.TRANSPARENT_COLOR);
        this.getChart().setBackgroundColor(LumoLightTheme.BGCOLOR);
        this.getChart().setPlotBorderWidth(0);
        this.getChart().setBorderRadius(0);
        this.getChart().setPlotShadow(false);
        this.getTooltip().setBackgroundColor(LumoLightTheme.TOOLTIP_BACKGROUND_COLOR);
        this.getTooltip().setBorderWidth(0);
        this.getTooltip().setBorderRadius(5);
        this.getTooltip().getStyle().setColor(LumoLightTheme.TOOLTIP_TEXT_COLOR);
        this.getLegend().setItemStyle(new Style());
        this.getLegend().getItemStyle().setColor(LumoLightTheme.LEGEND_TEXT_COLOR);
        this.getLegend().getItemStyle().setFontWeight(FontWeight.NORMAL);
        this.getLegend().getItemStyle().setFontSize("14px");
        final Style itemHoverStyle = new Style();
        itemHoverStyle.setColor(LumoLightTheme.LEGEND_TEXT_COLOR);
        this.getLegend().setItemHoverStyle(itemHoverStyle);
        this.getLegend().setItemHiddenStyle(new Style());
        this.getLegend().getItemHiddenStyle().setColor(new SolidColor(128, 128, 128));
        this.getLegend().setBorderRadius(5);
        this.getLegend().setBorderColor(LumoLightTheme.LINE_COLOR);
        this.getLegend().setBackgroundColor(LumoLightTheme.LEGEND_BACKGROUND_COLOR);
        this.getLabels().setColor(LumoLightTheme.TEXT_COLOR);
        this.getCredits().setStyle(new Style());
        this.getCredits().getStyle().setFontSize("14px");
        this.getCredits().getStyle().setColor(new SolidColor(128, 128, 128));
        this.getCredits().setText("");
        this.getCredits().setHref("");
        this.getPlotOptions().getHeatmap().setShadow(false);
        this.getPlotOptions().getMap().setShadow(false);
        this.getPlotOptions().getMapbubble().setShadow(false);
        this.getPlotOptions().getMapline().setShadow(false);
        this.getPlotOptions().getMappoint().setShadow(false);
        this.getPlotOptions().getSeries().setShadow(false);
        this.getPlotOptions().getMap().setNullColor(LumoLightTheme.NULL_COLOR);
        this.setDataLabelsDefaults(this.getPlotOptions().getHeatmap().getDataLabels());
        this.setDataLabelsDefaults(this.getPlotOptions().getMap().getDataLabels());
        this.setDataLabelsDefaults(this.getPlotOptions().getMapbubble().getDataLabels());
        this.setDataLabelsDefaults(this.getPlotOptions().getMapline().getDataLabels());
        this.setDataLabelsDefaults(this.getPlotOptions().getMappoint().getDataLabels());
        this.setDataLabelsDefaults(this.getPlotOptions().getSeries().getDataLabels());
    }

    protected void setDataLabelsDefaults(final AbstractDataLabels labels) {
        labels.setStyle(new Style());
        labels.getStyle().setFontFamily("Microsoft YaHei, Open Sans, Helvetica Neue, Arial, sans-serif");
        labels.getStyle().setFontSize("12px");
    }
}
