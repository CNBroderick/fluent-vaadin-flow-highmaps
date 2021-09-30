package org.bklab.flow.maps.model.style;

import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;
import org.bklab.flow.maps.model.AbstractConfigurationObject;
import org.bklab.flow.maps.model.Credits;

@Getter
@Setter
@Accessors(chain = true)
public class Theme extends AbstractConfigurationObject {
    private final StyleWrapper title = new StyleWrapper();
    private final StyleWrapper subtitle = new StyleWrapper();
    private final StyleWrapper labels = new StyleWrapper();
    private Color[] colors;
    private ChartStyle chart = new ChartStyle();
    private LegendStyle legend = new LegendStyle();
    private TooltipStyle tooltip = new TooltipStyle();
    private PlotOptionsStyle plotOptions = new PlotOptionsStyle();
    private Credits credits = new Credits();

    public Color[] getColors() {
        return this.colors;
    }

    public Theme setColors(final Color... colors) {
        this.colors = colors;
        return this;
    }

    public ChartStyle getChart() {
        return this.chart;
    }

    public Theme setChart(final ChartStyle style) {
        this.chart = style;
        return this;
    }

    public Style getTitle() {
        return this.title.getStyle();
    }

    public Theme setTitle(final Style style) {
        this.title.setStyle(style);
        return this;
    }

    public Style getSubtitle() {
        return this.subtitle.getStyle();
    }

    public Theme setSubtitle(final Style style) {
        this.subtitle.setStyle(style);
        return this;
    }

    public Style getLabels() {
        return this.labels.getStyle();
    }

    public Theme setLabels(final Style style) {
        this.labels.setStyle(style);
        return this;
    }

    public LegendStyle getLegend() {
        return this.legend;
    }

    public Theme setLegend(final LegendStyle style) {
        this.legend = style;
        return this;
    }

    public TooltipStyle getTooltip() {
        return this.tooltip;
    }

    public Theme setTooltip(final TooltipStyle tooltip) {
        this.tooltip = tooltip;
        return this;
    }

    public PlotOptionsStyle getPlotOptions() {
        return this.plotOptions;
    }

    public Theme setPlotOptions(final PlotOptionsStyle plotOptions) {
        this.plotOptions = plotOptions;
        return this;
    }

    public Credits getCredits() {
        return this.credits;
    }

    public Theme setCredits(final Credits credits) {
        this.credits = credits;
        return this;
    }
}
