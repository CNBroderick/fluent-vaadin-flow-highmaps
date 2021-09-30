package org.bklab.flow.maps.model;

public class BubblemapDataSeriesItem extends MapDataSeriesItem {
    private Number z;

    public BubblemapDataSeriesItem() {
    }

    public BubblemapDataSeriesItem(final Number lat, final Number lon, final Number z) {
        this();
        this.setLat(lat);
        this.setLon(lon);
        this.setZ(z);
    }

    public BubblemapDataSeriesItem(final String name, final Number lat, final Number lon, final Number z) {
        this(lat, lon, z);
        this.setName(name);
    }

    public Number getZ() {
        return this.z;
    }

    public void setZ(final Number z) {
        this.z = z;
    }
}
