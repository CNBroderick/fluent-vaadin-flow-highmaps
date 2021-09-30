package org.bklab.flow.maps.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import org.bklab.flow.maps.model.style.Color;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MapDataSeries extends AbstractSeries {
    private List<MapDataSeriesItem> data;
    @JsonIgnore
    private final List<Series> drilldownSeries;
    @JsonInclude(JsonInclude.Include.ALWAYS)
    private List<String> joinBy;
    private String mapData;

    public MapDataSeries() {
        this.data = new ArrayList<MapDataSeriesItem>();
        this.drilldownSeries = new ArrayList<Series>();
    }

    public MapDataSeries(final String name) {
        this.data = new ArrayList<MapDataSeriesItem>();
        this.drilldownSeries = new ArrayList<Series>();
        this.setName(name);
    }

    public MapDataSeries(final List<MapDataSeriesItem> items) {
        this.data = new ArrayList<MapDataSeriesItem>();
        this.drilldownSeries = new ArrayList<Series>();
        this.setData(items);
    }

    public MapDataSeries(final MapDataSeriesItem... items) {
        this.data = new ArrayList<MapDataSeriesItem>();
        this.drilldownSeries = new ArrayList<Series>();
        this.setData(Arrays.asList(items));
    }

    public void setData(final String[] codes, final Number[] values) {
        assert codes.length == values.length;
        this.data.clear();
        for (int i = 0; i < codes.length; ++i) {
            this.data.add(new MapDataSeriesItem(codes[i], values[i]));
        }
    }

    public void setData(final String[] codes, final Number[] values, final Color[] colors) {
        assert codes.length == values.length;
        assert codes.length == colors.length;
        this.data.clear();
        for (int i = 0; i < codes.length; ++i) {
            this.data.add(new MapDataSeriesItem(codes[i], values[i], colors[i]));
        }
    }

    public MapDataSeriesItem get(final String name) {
        for (final MapDataSeriesItem item : this.data) {
            if (item.getName().equals(name)) {
                return item;
            }
        }
        return null;
    }

    public void add(final MapDataSeriesItem item) {
        this.add(item, true, false);
    }

    public void addItemWithDrilldown(final MapDataSeriesItem item, final Series series) {
        this.add(item);
        if (series.getId() == null) {
            throw new IllegalArgumentException("Series ID may not be null");
        }
        item.setDrilldown(series.getId());
        this.addSeriesToDrilldownConfiguration(series);
    }

    public void addItemWithDrilldown(final MapDataSeriesItem item) {
        this.add(item);
        item.setDrilldown(true);
    }

    private void addSeriesToDrilldownConfiguration(final Series series) {
        if (this.getConfiguration() != null) {
            final Drilldown drilldown = this.getConfiguration().getDrilldown();
            drilldown.addSeries(series);
        } else {
            this.drilldownSeries.add(series);
        }
    }

    boolean hasDrilldownSeries() {
        return !this.drilldownSeries.isEmpty();
    }

    List<Series> getDrilldownSeries() {
        return this.drilldownSeries;
    }

    public void add(final MapDataSeriesItem item, final boolean updateMapImmediately, final boolean shift) {
        if (shift) {
            this.data.remove(0);
        }
        this.data.add(item);
        if (updateMapImmediately && this.getConfiguration() != null) {
            this.getConfiguration().fireDataAdded(this, item, shift);
        }
    }

    public void remove(final MapDataSeriesItem item) {
        final int pointIndex = this.data.indexOf(item);
        this.data.remove(pointIndex);
        if (this.getConfiguration() != null) {
            this.getConfiguration().fireDataRemoved(this, pointIndex);
        }
    }

    public void redraw() {
        if (this.getConfiguration() != null) {
            this.getConfiguration().fireSeriesChanged(this);
        }
    }

    public List<MapDataSeriesItem> getData() {
        return Collections.unmodifiableList(this.data);
    }

    public void setData(final List<MapDataSeriesItem> data) {
        this.data = data;
    }

    public void update(final MapDataSeriesItem item) {
        if (this.getConfiguration() != null) {
            this.getConfiguration().fireDataUpdated(this, item, this.data.indexOf(item));
        }
    }

    public MapDataSeriesItem get(final int index) {
        return this.data.get(index);
    }

    public int size() {
        return this.data.size();
    }

    public void clear() {
        this.data.clear();
    }

    public void setJoinBy(final String mapDataKey, final String dataKey) {
        this.joinBy = Arrays.asList(mapDataKey, dataKey);
    }

    public List<String> getJoinBy() {
        return this.joinBy;
    }

    public void setJoinBy(final String dataKey) {
        this.joinBy = Arrays.asList(dataKey);
    }

    public void resetJoinBy() {
        this.joinBy = null;
    }

    public String getMapData() {
        return this.mapData;
    }

    public void setMapData(final String mapData) {
        this.mapData = mapData;
    }
}
