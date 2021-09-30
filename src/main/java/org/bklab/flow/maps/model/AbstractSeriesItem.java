package org.bklab.flow.maps.model;

import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;
import org.bklab.flow.maps.model.style.Color;

@Getter
@Setter
@Accessors(chain = true)
public class AbstractSeriesItem extends AbstractConfigurationObject {
    private Number value;
    private Number lat;
    private Number lon;
    private Number x;
    private Number y;
    private String name;
    private Color color;
    private Number legendIndex;
    private Marker marker;
    private String id;

    public AbstractSeriesItem() {
    }

    public AbstractSeriesItem(final Number lat, final Number lon) {
        this();
        this.lat = lat;
        this.lon = lon;
    }

    public AbstractSeriesItem(final Number lat, final Number lon, final Number value) {
        this(lat, lon);
        this.value = value;
    }

    public AbstractSeriesItem(final String name, final Number lat, final Number lon, final Number value) {
        this(lat, lon, value);
        this.name = name;
    }

    public Marker getMarker() {
        if (this.marker == null) {
            this.marker = new Marker();
        }
        return this.marker;
    }

}
