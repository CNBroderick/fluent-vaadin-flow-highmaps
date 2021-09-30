package org.bklab.flow.maps.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.Accessors;
import org.bklab.flow.maps.model.style.Color;

@Getter
@Setter
@Accessors(chain = true)
public class PlotOptionsHeatmap extends AbstractPlotOptions {
    private Boolean allowPointSelect;
    private Boolean animation;
    private Number animationLimit;
    private Color borderColor;
    private Number borderWidth;
    private Color color;
    private ColorAxis colorAxis;
    private Number colsize;
    private Cursor cursor;
    private DataLabels dataLabels;
    private Boolean enableMouseTracking;
    private Color nullColor;
    private Number rowsize;
    private Boolean selected;
    private Boolean shadow;
    private Boolean showCheckbox;
    private Boolean showInLegend;
    private States states;
    private Boolean stickyTracking;
    private SeriesTooltip tooltip;
    private Boolean visible;
    private Number zIndex;

    public PlotOptionsHeatmap() {
        super(MapType.HEATMAP);
    }

    public ColorAxis getColorAxis() {
        if (this.colorAxis == null) {
            this.colorAxis = new ColorAxis();
        }
        return this.colorAxis;
    }

    public DataLabels getDataLabels() {
        if (this.dataLabels == null) {
            this.dataLabels = new DataLabels();
        }
        return this.dataLabels;
    }

    public States getStates() {
        if (this.states == null) {
            this.states = new States();
        }
        return this.states;
    }

    public SeriesTooltip getTooltip() {
        if (this.tooltip == null) {
            this.tooltip = new SeriesTooltip();
        }
        return this.tooltip;
    }
}
