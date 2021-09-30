package org.bklab.flow.maps.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.Accessors;
import org.bklab.flow.maps.model.style.ButtonTheme;
import org.bklab.flow.maps.model.style.Style;

@Getter
@Setter
@Accessors(chain = true)
@NoArgsConstructor
public class ZoomOut extends AbstractConfigurationObject {
    private HorizontalAlign align;
    private String alignTo;
    private Number height;
    private Style style;
    private String text;
    private ButtonTheme theme;
    private VerticalAlign verticalAlign;
    private Number width;
    private Number x;
    private Number y;


    public ZoomOut(final String text) {
        this.text = text;
    }

    public Style getStyle() {
        if (this.style == null) {
            this.style = new Style();
        }
        return this.style;
    }

    public ButtonTheme getTheme() {
        if (this.theme == null) {
            this.theme = new ButtonTheme();
        }
        return this.theme;
    }

}
