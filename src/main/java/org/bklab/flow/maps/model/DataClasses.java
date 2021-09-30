package org.bklab.flow.maps.model;

import org.bklab.flow.maps.model.style.Color;

public class DataClasses extends AbstractConfigurationObject {
    private Color color;
    private Number from;
    private String name;
    private Number to;

    public Color getColor() {
        return this.color;
    }

    public void setColor(final Color color) {
        this.color = color;
    }

    public Number getFrom() {
        return this.from;
    }

    public void setFrom(final Number from) {
        this.from = from;
    }

    public String getName() {
        return this.name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public Number getTo() {
        return this.to;
    }

    public void setTo(final Number to) {
        this.to = to;
    }
}
