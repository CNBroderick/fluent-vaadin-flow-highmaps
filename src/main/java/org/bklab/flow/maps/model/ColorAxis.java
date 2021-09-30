package org.bklab.flow.maps.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.Accessors;
import org.bklab.flow.maps.model.style.Color;

import java.util.ArrayList;
import java.util.Collections;


@Getter
@Setter
@Accessors(chain = true)
@NoArgsConstructor
public class ColorAxis extends Axis<ColorAxis> {
    private String dataClassColor;
    private DataClasses dataClasses;
    private Boolean endOnTick;
    private Color gridLineColor;
    private DashStyle gridLineDashStyle;
    private Number gridLineWidth;
    private String id;
    private Labels labels;
    private Color lineColor;
    private Number lineWidth;
    private Marker marker;
    private Color maxColor;
    private Number maxPadding;
    private Color minColor;
    private Number minPadding;
    private Color minorGridLineColor;
    private DashStyle minorGridLineDashStyle;
    private Number minorGridLineWidth;
    private Color minorTickColor;
    private String minorTickInterval;
    private Number minorTickLength;
    private TickPosition minorTickPosition;
    private Number minorTickWidth;
    private Boolean reversed;
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
    private String type;
    private ArrayList<Stop> stops;


    public DataClasses getDataClasses() {
        if (this.dataClasses == null) {
            this.dataClasses = new DataClasses();
        }
        return this.dataClasses;
    }


    public Stop[] getStops() {
        if (this.stops == null) {
            return new Stop[0];
        }
        return this.stops.toArray(new Stop[]{});
    }

    public ColorAxis setStops(final Stop... stops) {
        this.stops = new ArrayList<>();
        Collections.addAll(this.stops, stops);
        return this;
    }

    public ArrayList<Stop> stops() {
        if (this.stops == null) {
            this.stops = new ArrayList<>();
        }
        return this.stops;
    }

    public ColorAxis addStop(final Stop stop) {
        this.stops().add(stop);
        return this;
    }

    public ColorAxis removeStop(final Stop stop) {
        this.stops().remove(stop);
        return this;
    }
}
