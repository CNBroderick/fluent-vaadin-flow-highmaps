package org.bklab.flow.maps.model;

import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;
import org.bklab.flow.maps.model.style.Color;

@Getter
@Setter
@Accessors(chain = true)
public class PlotOptionsMapbubble extends AbstractPlotOptions {
    private Boolean allAreas;
    private Boolean allowPointSelect;
    private Boolean animation;
    private Number animationLimit;
    private Color borderColor;
    private Number borderWidth;
    private Color color;
    private ColorAxis colorAxis;
    private Cursor cursor;
    private DataLabels dataLabels;
    private Boolean displayNegative;
    private Boolean enableMouseTracking;
    private Color negativeColor;
    private Boolean selected;
    private Boolean shadow;
    private Boolean showCheckbox;
    private Boolean showInLegend;
    private String sizeBy;
    private Boolean sizeByAbsoluteValue;
    private States states;
    private Boolean stickyTracking;
    private SeriesTooltip tooltip;
    private Boolean visible;
    private Number zIndex;
    private Number zMax;
    private Number zMin;
    private Number zThreshold;

    public PlotOptionsMapbubble() {
        super(MapType.MAPBUBBLE);
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
