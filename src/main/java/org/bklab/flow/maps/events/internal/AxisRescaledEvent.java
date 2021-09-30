package org.bklab.flow.maps.events.internal;

import java.io.Serializable;

public class AxisRescaledEvent implements Serializable {
    private static final long serialVersionUID = 20141118L;
    private final int axis;
    private final int axisIndex;
    private final Number minimum;
    private final Number maximum;
    private final boolean redraw;
    private final boolean animate;

    public AxisRescaledEvent(final int axis, final int axisIndex, final Number minimum, final Number maximum, final boolean redraw, final boolean animate) {
        this.axis = axis;
        this.axisIndex = axisIndex;
        this.minimum = minimum;
        this.maximum = maximum;
        this.redraw = redraw;
        this.animate = animate;
    }

    public AxisRescaledEvent(final int axis, final int axisIndex, final Number minimum, final Number maximum, final boolean redraw) {
        this(axis, axisIndex, minimum, maximum, redraw, true);
    }

    public AxisRescaledEvent(final int axis, final int axisIndex, final Number minimum, final Number maximum) {
        this(axis, axisIndex, minimum, maximum, true, true);
    }

    public Number getMinimum() {
        return this.minimum;
    }

    public Number getMaximum() {
        return this.maximum;
    }

    public boolean isRedrawingNeeded() {
        return this.redraw;
    }

    public boolean isAnimated() {
        return this.animate;
    }

    public int getAxisIndex() {
        return this.axisIndex;
    }

    public int getAxis() {
        return this.axis;
    }
}
