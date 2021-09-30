package org.bklab.flow.maps.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import org.bklab.flow.maps.events.internal.*;

import java.util.*;

public class Configuration extends AbstractConfigurationObject implements MapConfiguration {
    @JsonIgnore
    private final List<ConfigurationChangeListener> changeListeners;
    private Accessibility accessibility;
    private MapModel chart;
    private Title title;
    private Subtitle subtitle;
    private AxisList<XAxis> xAxis;
    private AxisList<YAxis> yAxis;
    private AxisList<ColorAxis> colorAxis;
    private Tooltip tooltip;
    private Legend legend;
    private Credits credits;
    private final Map<String, AbstractPlotOptions> plotOptions;
    private HTMLLabels labels;
    private List<Series> series;
    private Drilldown drilldown;
    private Exporting exporting;
    private Loading loading;
    private MapNavigation mapNavigation;
    private Navigation navigation;

    public Configuration() {
        this.plotOptions = new HashMap<String, AbstractPlotOptions>();
        this.series = new ArrayList<Series>();
        this.exporting = new Exporting(false);
        this.changeListeners = new ArrayList<ConfigurationChangeListener>();
    }

    public Accessibility getAccessibility() {
        if (this.accessibility == null) {
            this.setAccessibility(new Accessibility());
        }
        return this.accessibility;
    }

    public void setAccessibility(final Accessibility accessibility) {
        this.accessibility = accessibility;
    }

    public MapModel getChart() {
        if (this.chart == null) {
            this.chart = new MapModel();
        }
        return this.chart;
    }

    public void setChart(final MapModel chart) {
        this.chart = chart;
    }

    public List<Series> getSeries() {
        return Collections.unmodifiableList(this.series);
    }

    public void setSeries(final List<Series> series) {
        this.series = series;
        for (final Series s : series) {
            s.setConfiguration(this);
        }
    }

    public void setSeries(final Series... series) {
        this.setSeries(Arrays.asList(series));
    }

    public void addSeries(final Series series) {
        this.series.add(series);
        series.setConfiguration(this);
        this.addSeriesToDrilldownConfiguration(series);
        this.fireSeriesAdded(series);
    }

    private void addSeriesToDrilldownConfiguration(final Series series) {
        if (series instanceof MapDataSeries) {
            final MapDataSeries dataSeries = (MapDataSeries) series;
            if (dataSeries.hasDrilldownSeries()) {
                final Drilldown drilldown = this.getDrilldown();
                for (final Series s : ((MapDataSeries) series).getDrilldownSeries()) {
                    drilldown.addSeries(s);
                    this.addSeriesToDrilldownConfiguration(s);
                }
            }
        }
    }

    public Drilldown getDrilldown() {
        if (this.drilldown == null) {
            (this.drilldown = new Drilldown()).setConfiguration(this);
        }
        return this.drilldown;
    }

    public Title getTitle() {
        if (this.title == null) {
            this.title = new Title();
        }
        return this.title;
    }

    public void setTitle(final Title title) {
        this.title = title;
    }

    public void setTitle(final String text) {
        this.title = new Title(text);
    }

    public Subtitle getSubTitle() {
        if (this.subtitle == null) {
            this.subtitle = new Subtitle();
        }
        return this.subtitle;
    }

    public void setSubTitle(final String text) {
        this.subtitle = new Subtitle(text);
    }

    public void setSubTitle(final Subtitle subTitle) {
        this.subtitle = subTitle;
    }

    public XAxis getxAxis() {
        if (this.xAxis == null) {
            this.xAxis = new AxisList<XAxis>();
        }
        if (this.xAxis.getNumberOfAxes() == 0) {
            final XAxis x = new XAxis();
            x.setConfiguration(this);
            this.xAxis.addAxis(x);
        }
        return this.xAxis.getAxis(0);
    }

    public int getNumberOfxAxes() {
        if (this.xAxis == null) {
            return 0;
        }
        return this.xAxis.getNumberOfAxes();
    }

    public XAxis getxAxis(final int index) {
        if (index >= 0 && this.xAxis != null && this.getNumberOfxAxes() > index) {
            return this.xAxis.getAxis(index);
        }
        return null;
    }

    public void removexAxes() {
        this.xAxis = null;
    }

    public void addxAxis(final XAxis axis) {
        if (this.xAxis == null) {
            this.xAxis = new AxisList<XAxis>();
        }
        if (axis.getConfiguration() == null) {
            axis.setConfiguration(this);
        }
        this.xAxis.addAxis(axis);
    }

    public YAxis getyAxis() {
        if (this.yAxis == null) {
            this.yAxis = new AxisList<YAxis>();
        }
        if (this.yAxis.getNumberOfAxes() == 0) {
            final YAxis y = new YAxis();
            y.setConfiguration(this);
            this.yAxis.addAxis(y);
        }
        return this.yAxis.getAxis(0);
    }

    public int getNumberOfyAxes() {
        if (this.yAxis == null) {
            return 0;
        }
        return this.yAxis.getNumberOfAxes();
    }

    public YAxis getyAxis(final int index) {
        if (index >= 0 && this.yAxis != null && this.getNumberOfyAxes() > index) {
            return this.yAxis.getAxis(index);
        }
        return null;
    }

    public void removeyAxes() {
        this.yAxis = null;
    }

    public void addyAxis(final YAxis axis) {
        if (this.yAxis == null) {
            this.yAxis = new AxisList<YAxis>();
        }
        if (axis.getConfiguration() == null) {
            axis.setConfiguration(this);
        }
        this.yAxis.addAxis(axis);
    }

    public AxisList<YAxis> getyAxes() {
        if (this.yAxis != null) {
            return this.yAxis;
        }
        return null;
    }

    public Tooltip getTooltip() {
        if (this.tooltip == null) {
            this.tooltip = new Tooltip();
        }
        return this.tooltip;
    }

    public void setTooltip(final Tooltip tooltip) {
        this.tooltip = tooltip;
    }

    public Credits getCredits() {
        if (this.credits == null) {
            this.credits = new Credits();
        }
        return this.credits;
    }

    public void setCredits(final Credits credits) {
        this.credits = credits;
    }

    public void disableCredits() {
        final Credits disabled = new Credits();
        disabled.setEnabled(false);
        this.setCredits(disabled);
    }

    public Legend getLegend() {
        if (this.legend == null) {
            this.legend = new Legend();
        }
        return this.legend;
    }

    public void setLegend(final Legend legend) {
        this.legend = legend;
    }

    public Collection<AbstractPlotOptions> getPlotOptions() {
        return this.plotOptions.values();
    }

    public void setPlotOptions(final AbstractPlotOptions... plotOptions) {
        this.plotOptions.clear();
        for (final AbstractPlotOptions po : plotOptions) {
            this.addPlotOptions(po);
        }
    }

    public AbstractPlotOptions getPlotOptions(final MapType type) {
        return this.plotOptions.get(type.toString());
    }

    public void addPlotOptions(final AbstractPlotOptions plotOptions) {
        if (plotOptions instanceof PlotOptionsSeries) {
            this.plotOptions.put("series", plotOptions);
        } else {
            this.plotOptions.put(plotOptions.getMapType().toString(), plotOptions);
        }
    }

    public HTMLLabels getLabels() {
        return this.labels;
    }

    public void setLabels(final HTMLLabels labels) {
        this.labels = labels;
    }

    public Exporting getExporting() {
        return this.exporting;
    }

    public void setExporting(final Boolean exporting) {
        this.exporting.setEnabled(exporting);
    }

    public void setExporting(final Exporting exporting) {
        this.exporting = exporting;
    }

    public Boolean isExporting() {
        return this.exporting.getEnabled();
    }

    public Navigation getNavigation() {
        if (this.navigation == null) {
            this.navigation = new Navigation();
        }
        return this.navigation;
    }

    public void setNavigation(final Navigation navigation) {
        this.navigation = navigation;
    }

    public MapNavigation getMapNavigation() {
        if (this.mapNavigation == null) {
            this.mapNavigation = new MapNavigation();
        }
        return this.mapNavigation;
    }

    public void setMapNavigation(final MapNavigation mapNavigation) {
        this.mapNavigation = mapNavigation;
    }

    public Loading getLoading() {
        if (this.loading == null) {
            this.loading = new Loading();
        }
        return this.loading;
    }

    public void setLoading(final Loading loading) {
        this.loading = loading;
    }

    void fireDataAdded(final Series series, final Number value) {
        final DataAddedEvent dataAddedEvent = new DataAddedEvent(series, value);
        for (final ConfigurationChangeListener listener : this.changeListeners) {
            listener.dataAdded(dataAddedEvent);
        }
    }

    void fireDataAdded(final Series series, final MapDataSeriesItem item, final boolean shift) {
        final DataAddedEvent dataAddedEvent = new DataAddedEvent(series, item, shift);
        for (final ConfigurationChangeListener listener : this.changeListeners) {
            listener.dataAdded(dataAddedEvent);
        }
    }

    void fireDataRemoved(final Series series, final int index) {
        final DataRemovedEvent dataRemovedEvent = new DataRemovedEvent(series, index);
        for (final ConfigurationChangeListener listener : this.changeListeners) {
            listener.dataRemoved(dataRemovedEvent);
        }
    }

    void fireDataUpdated(final Series series, final Number value, final int pointIndex) {
        final DataUpdatedEvent dataUpdatedEvent = new DataUpdatedEvent(series, value, pointIndex);
        for (final ConfigurationChangeListener listener : this.changeListeners) {
            listener.dataUpdated(dataUpdatedEvent);
        }
    }

    void fireDataUpdated(final Series series, final MapDataSeriesItem item, final int pointIndex) {
        final DataUpdatedEvent dataUpdatedEvent = new DataUpdatedEvent(series, item, pointIndex);
        for (final ConfigurationChangeListener listener : this.changeListeners) {
            listener.dataUpdated(dataUpdatedEvent);
        }
    }

    void fireSeriesAdded(final Series series) {
        final SeriesAddedEvent seriesAddedEvent = new SeriesAddedEvent(series);
        for (final ConfigurationChangeListener listener : this.changeListeners) {
            listener.seriesAdded(seriesAddedEvent);
        }
    }

    void fireSeriesChanged(final Series series) {
        final SeriesChangedEvent event = new SeriesChangedEvent(series);
        for (final ConfigurationChangeListener listener : this.changeListeners) {
            listener.seriesChanged(event);
        }
    }

    void fireSeriesEnabled(final Series series, final boolean enabled) {
        final SeriesStateEvent seriesEnablationEvent = new SeriesStateEvent(series, enabled);
        for (final ConfigurationChangeListener listener : this.changeListeners) {
            listener.seriesStateChanged(seriesEnablationEvent);
        }
    }

    private AxisDimension getAxisDimension(final Axis axis) {
        if (axis instanceof ColorAxis) {
            return AxisDimension.COLOR_AXIS;
        }
        if (axis instanceof XAxis) {
            return AxisDimension.X_AXIS;
        }
        if (axis instanceof YAxis) {
            return AxisDimension.Y_AXIS;
        }
        return null;
    }

    private int getAxisIndex(final AxisDimension dimension, final Axis axis) {
        switch (dimension) {
            case X_AXIS: {
                return this.xAxis.indexOf(axis);
            }
            case Y_AXIS: {
                return this.yAxis.indexOf(axis);
            }
            case COLOR_AXIS: {
                return this.colorAxis.indexOf(axis);
            }
            default: {
                return -1;
            }
        }
    }

    @Override
    public void fireAxesRescaled(final Axis axis, final Number minimum, final Number maximum, final boolean redraw, final boolean animate) {
        final AxisDimension axisType = this.getAxisDimension(axis);
        if (axisType != null) {
            final int axisIndex = this.getAxisIndex(axisType, axis);
            final AxisRescaledEvent event = new AxisRescaledEvent(axisType.getIndex(), axisIndex, minimum, maximum, redraw, animate);
            for (final ConfigurationChangeListener listener : this.changeListeners) {
                listener.axisRescaled(event);
            }
        }
    }

    public void resetZoom() {
        this.resetZoom(true, true);
    }

    public void resetZoom(final boolean redraw, final boolean animate) {
        for (final ConfigurationChangeListener listener : this.changeListeners) {
            listener.resetZoom(redraw, animate);
        }
    }

    void fireItemSliced(final Series series, final int index, final boolean sliced, final boolean redraw, final boolean animation) {
        final ItemSlicedEvent event = new ItemSlicedEvent(series, index, sliced, redraw, animation);
        for (final ConfigurationChangeListener listener : this.changeListeners) {
            listener.itemSliced(event);
        }
    }

    public void addChangeListener(final ConfigurationChangeListener listener) {
        if (!this.changeListeners.contains(listener)) {
            this.changeListeners.add(listener);
        }
    }

    public void removeChangeListener(final ConfigurationChangeListener listener) {
        this.changeListeners.remove(listener);
    }

    public ColorAxis getColorAxis() {
        if (this.colorAxis == null) {
            this.colorAxis = new AxisList<ColorAxis>();
        }
        if (this.colorAxis.getNumberOfAxes() == 0) {
            final ColorAxis c = new ColorAxis();
            c.setConfiguration(this);
            this.colorAxis.addAxis(c);
        }
        return this.colorAxis.getAxis(0);
    }

    public int getNumberOfColorAxes() {
        if (this.colorAxis == null) {
            return 0;
        }
        return this.colorAxis.getNumberOfAxes();
    }

    public ColorAxis getColorAxis(final int index) {
        if (index > 0 && this.colorAxis != null && this.getNumberOfColorAxes() > index) {
            return this.colorAxis.getAxis(index);
        }
        return null;
    }

    public void removeColorAxes() {
        this.colorAxis = null;
    }

    public void addColorAxis(final ColorAxis axis) {
        if (this.colorAxis == null) {
            this.colorAxis = new AxisList<ColorAxis>();
        }
        if (axis.getConfiguration() == null) {
            axis.setConfiguration(this);
        }
        this.colorAxis.addAxis(axis);
    }
}
