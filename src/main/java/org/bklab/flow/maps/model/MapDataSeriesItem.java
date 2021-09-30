package org.bklab.flow.maps.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.Accessors;
import org.bklab.flow.maps.model.style.Color;

@Getter
@Setter
@Accessors(chain = true)
@NoArgsConstructor
public class MapDataSeriesItem extends AbstractSeriesItem {
    private Boolean selected;
    private DataLabels dataLabels;
    private String cursor;
    private String code;
    private Object drilldown;

    public MapDataSeriesItem(final String code, final Number value) {
        this.setCode(code);
        this.setValue(value);
    }

    public MapDataSeriesItem(final String code, final Number value, final boolean drilldown) {
        this.setCode(code);
        this.setValue(value);
        this.setDrilldown(drilldown);
    }

    public MapDataSeriesItem(final String code, final Number value, final Color color) {
        this.setCode(code);
        this.setValue(value);
        this.setColor(color);
    }

    public boolean isSelected() {
        return this.selected != null && this.selected;
    }

    @Override
    public AbstractSeriesItem setLegendIndex(final Number legendIndex) {
        super.setLegendIndex(legendIndex);
        return this;
    }
}
