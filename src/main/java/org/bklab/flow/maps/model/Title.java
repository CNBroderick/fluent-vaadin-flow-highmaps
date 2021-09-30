package org.bklab.flow.maps.model;

import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

@Getter
@Setter
@Accessors(chain = true)
public class Title extends AbstractConfigurationObject {
    private HorizontalAlign align;
    private Boolean floating;
    private Number margin;
    private String text;
    private Boolean useHTML;
    private VerticalAlign verticalAlign;
    private Number widthAdjust;
    private Number x;
    private Number y;
    private CSSObject style;

    public Title() {
        this.style = new CSSObject();
    }

    public Title(final String text) {
        this.style = new CSSObject();
        this.text = text;
    }
}
