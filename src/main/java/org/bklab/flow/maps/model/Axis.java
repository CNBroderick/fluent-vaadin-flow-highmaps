package org.bklab.flow.maps.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;
import org.bklab.flow.maps.model.style.Color;

@SuppressWarnings("unchecked")
@Getter
@Setter
@Accessors(chain = true)
public abstract class Axis<A extends Axis<A>> extends AbstractConfigurationObject {
    private static final long serialVersionUID = 1L;
    protected Number min;
    protected Number max;
    private Integer axisIndex;
    @JsonIgnore
    private MapConfiguration configuration;

    public A setExtremes(final Number min, final Number max) {
        this.setExtremes(min, max, true, true);
        return (A) this;
    }

    public A setExtremes(final Number min, final Number max, final boolean redraw) {
        this.setExtremes(min, max, redraw, true);
        return (A) this;
    }

    public A setExtremes(final Number minimum, final Number maximum, final boolean redraw, final boolean animate) {
        this.min = minimum;
        this.max = maximum;
        if (this.configuration != null) {
            this.configuration.fireAxesRescaled(this, minimum, maximum, redraw, animate);
        }
        return (A) this;
    }

    public abstract Boolean getEndOnTick();

    abstract A setEndOnTick(final Boolean p0);

    public abstract Color getGridLineColor();

    public abstract A setGridLineColor(final Color p0);

    public abstract DashStyle getGridLineDashStyle();

    public abstract A setGridLineDashStyle(final DashStyle p0);

    public abstract Number getGridLineWidth();

    public abstract A setGridLineWidth(final Number p0);

    public abstract String getId();

    public abstract A setId(final String p0);

    public abstract Labels getLabels();

    public abstract A setLabels(final Labels p0);

    public abstract Number getMaxPadding();

    public abstract A setMaxPadding(final Number p0);

    public abstract Number getMinPadding();

    public abstract A setMinPadding(final Number p0);

    public abstract Color getMinorGridLineColor();

    public abstract A setMinorGridLineColor(final Color p0);

    public abstract DashStyle getMinorGridLineDashStyle();

    public abstract A setMinorGridLineDashStyle(final DashStyle p0);

    public abstract Number getMinorGridLineWidth();

    public abstract A setMinorGridLineWidth(final Number p0);

    public abstract Color getMinorTickColor();

    public abstract A setMinorTickColor(final Color p0);

    public abstract String getMinorTickInterval();

    public abstract A setMinorTickInterval(final String p0);

    public abstract Number getMinorTickLength();

    public abstract A setMinorTickLength(final Number p0);

    public abstract TickPosition getMinorTickPosition();

    public abstract A setMinorTickPosition(final TickPosition p0);

    public abstract Number getMinorTickWidth();

    public abstract A setMinorTickWidth(final Number p0);

    public abstract Boolean getReversed();

    public abstract A setReversed(final Boolean p0);

    public abstract Boolean getShowFirstLabel();

    public abstract A setShowFirstLabel(final Boolean p0);

    public abstract Boolean getShowLastLabel();

    public abstract A setShowLastLabel(final Boolean p0);

    public abstract Boolean getStartOnTick();

    public abstract A setStartOnTick(final Boolean p0);

    public abstract Color getTickColor();

    public abstract A setTickColor(final Color p0);

    public abstract Number getTickInterval();

    public abstract A setTickInterval(final Number p0);

    public abstract Number getTickLength();

    public abstract A setTickLength(final Number p0);

    public abstract Number getTickPixelInterval();

    public abstract A setTickPixelInterval(final Number p0);

    public abstract TickPosition getTickPosition();

    public abstract A setTickPosition(final TickPosition p0);

    public abstract Number[] getTickPositions();

    public abstract A setTickPositions(final Number[] p0);

    public abstract Number getTickWidth();

    public abstract A setTickWidth(final Number p0);
}
