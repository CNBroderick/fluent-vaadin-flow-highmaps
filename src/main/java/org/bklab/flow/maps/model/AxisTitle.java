package org.bklab.flow.maps.model;

import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;
import org.bklab.flow.maps.model.style.Style;


@Getter
@Setter
@Accessors(chain = true)
public class AxisTitle extends AbstractConfigurationObject {
    private VerticalAlign align;
    private Number margin;
    private Number offset;
    private Number rotation;
    private Style style;
    private String text;

    public AxisTitle() {
    }

    public AxisTitle(final String text) {
        this.text = text;
    }

    public Style getStyle() {
        if (this.style == null) {
            this.style = new Style();
        }
        return this.style;
    }

}
