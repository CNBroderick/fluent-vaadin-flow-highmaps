package org.bklab.flow.maps.events.internal;

import org.bklab.flow.maps.model.Series;

public class ItemSlicedEvent extends AbstractSeriesEvent {
    private final int index;
    private final boolean sliced;
    private final boolean redraw;
    private final boolean animation;

    public ItemSlicedEvent(final Series series, final int index, final boolean sliced, final boolean redraw, final boolean animation) {
        super(series);
        this.index = index;
        this.sliced = sliced;
        this.redraw = redraw;
        this.animation = animation;
    }

    public ItemSlicedEvent(final Series series, final int index, final boolean sliced, final boolean redraw) {
        this(series, index, sliced, redraw, true);
    }

    public ItemSlicedEvent(final Series series, final int index, final boolean sliced) {
        this(series, index, sliced, true, true);
    }

    public int getIndex() {
        return this.index;
    }

    public boolean isSliced() {
        return this.sliced;
    }

    public boolean isRedraw() {
        return this.redraw;
    }

    public boolean isAnimation() {
        return this.animation;
    }
}
