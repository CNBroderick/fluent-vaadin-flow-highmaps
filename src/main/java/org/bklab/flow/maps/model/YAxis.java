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
public class YAxis extends Axis {
    private Boolean allowDecimals;
    private Color alternateGridColor;
    private Crosshair crosshair;
    private Boolean endOnTick;
    private Color gridLineColor;
    private DashStyle gridLineDashStyle;
    private Number gridLineWidth;
    private String id;
    private Labels labels;
    private Color lineColor;
    private Number lineWidth;
    private Number maxPadding;
    private Number minPadding;
    private Number minRange;
    private Number minTickInterval;
    private Color minorGridLineColor;
    private DashStyle minorGridLineDashStyle;
    private Number minorGridLineWidth;
    private Color minorTickColor;
    private String minorTickInterval;
    private Number minorTickLength;
    private TickPosition minorTickPosition;
    private Number minorTickWidth;
    private Number offset;
    private Boolean opposite;
    private Boolean reversed;
    private Boolean showEmpty;
    private Boolean showFirstLabel;
    private Boolean showLastLabel;
    private Boolean startOnTick;
    private Color tickColor;
    private Number tickInterval;
    private Number tickLength;
    private Number tickPixelInterval;
    private TickPosition tickPosition;
    private Number[] tickPositions;
    private Number tickWidth;
    private AxisTitle title;

    public Crosshair getCrosshair() {
        if (this.crosshair == null) {
            this.crosshair = new Crosshair();
        }
        return this.crosshair;
    }

    @Override
    public Labels getLabels() {
        if (this.labels == null) {
            this.labels = new Labels();
        }
        return this.labels;
    }

    public AxisTitle getTitle() {
        if (this.title == null) {
            this.title = new AxisTitle();
        }
        return this.title;
    }

    public YAxis setTitle(final AxisTitle title) {
        this.title = title;
        return this;
    }

    public YAxis setTitle(final String title) {
        return this.setTitle(new AxisTitle(title));
    }
}
