package org.bklab.flow.maps.model;

public class ButtonPosition extends AbstractConfigurationObject {
    private VerticalAlign verticalAlign;
    private HorizontalAlign align;
    private Number x;
    private Number y;

    public VerticalAlign getVerticalAlign() {
        return this.verticalAlign;
    }

    public void setVerticalAlign(final VerticalAlign verticalAlign) {
        this.verticalAlign = verticalAlign;
    }

    public HorizontalAlign getHorizontalAlign() {
        return this.align;
    }

    public void setHorizontalAlign(final HorizontalAlign horizontalAlign) {
        this.align = horizontalAlign;
    }

    public Number getX() {
        return this.x;
    }

    public void setX(final Number x) {
        this.x = x;
    }

    public Number getY() {
        return this.y;
    }

    public void setY(final Number y) {
        this.y = y;
    }
}
