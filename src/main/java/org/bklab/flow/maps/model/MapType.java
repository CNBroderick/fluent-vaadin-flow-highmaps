package org.bklab.flow.maps.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

@Getter
@Accessors(chain = true)
@NoArgsConstructor
public enum MapType implements MapEnum {
    HEATMAP("heatmap"),
    MAP("map"),
    MAPBUBBLE("mapbubble"),
    MAPLINE("mapline"),
    MAPPOINT("mappoint"),
    ;

    private String type;

    MapType(String type) {
        this.type = type;
    }

    public static MapType getDefault() {
        return MAP;
    }

    @Override
    public String toString() {
        return this.type;
    }
}
