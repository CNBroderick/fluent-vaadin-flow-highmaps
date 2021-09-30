package org.bklab.flow.maps.model;

import lombok.Getter;

@Getter
public abstract class AbstractPlotOptions extends AbstractConfigurationObject {
    protected final MapType mapType;

    public AbstractPlotOptions() {
        this(MapType.getDefault());
    }

    public AbstractPlotOptions(MapType mapType) {
        this.mapType = mapType;
    }
}
