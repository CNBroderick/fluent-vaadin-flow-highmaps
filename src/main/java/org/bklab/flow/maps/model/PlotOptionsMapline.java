package org.bklab.flow.maps.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.Accessors;
import org.bklab.flow.maps.model.style.Color;


@Getter
@Setter
@Accessors(chain = true)
public class PlotOptionsMapline extends AbstractPlotOptions {
    private Boolean allAreas;
    private Boolean allowPointSelect;
    private Boolean animation;
    private Number animationLimit;
    private Color color;
    private ColorAxis colorAxis;
    private Cursor cursor;
    private DashStyle dashStyle;
    private DataLabels dataLabels;
    private Boolean enableMouseTracking;
    private Color fillColor;
    private Number lineWidth;
    private Boolean selected;
    private Boolean shadow;
    private Boolean showCheckbox;
    private Boolean showInLegend;
    private States states;
    private Boolean stickyTracking;
    private SeriesTooltip tooltip;
    private Boolean visible;
    private Number zIndex;


    public PlotOptionsMapline() {
        super( MapType.MAPLINE);
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
