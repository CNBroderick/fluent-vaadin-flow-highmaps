package org.bklab.flow.maps.model.style;

import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;
import org.bklab.flow.maps.model.*;

@Getter
@Setter
@Accessors(chain = true)
public class PlotOptionsStyle extends AbstractConfigurationObject {
    private PlotOptionsHeatmap heatmap;
    private PlotOptionsMap map;
    private PlotOptionsMapbubble mapbubble;
    private PlotOptionsMapline mapline;
    private PlotOptionsMappoint mappoint;
    private PlotOptionsSeries series;

    public PlotOptionsStyle() {
        this.heatmap = new PlotOptionsHeatmap();
        this.map = new PlotOptionsMap();
        this.mapbubble = new PlotOptionsMapbubble();
        this.mapline = new PlotOptionsMapline();
        this.mappoint = new PlotOptionsMappoint();
        this.series = new PlotOptionsSeries();
    }

}
