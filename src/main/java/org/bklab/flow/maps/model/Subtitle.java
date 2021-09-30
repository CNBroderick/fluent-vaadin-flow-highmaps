package org.bklab.flow.maps.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.Accessors;

@Getter
@Setter
@Accessors(chain = true)
@NoArgsConstructor
public class Subtitle extends AbstractConfigurationObject {
    private HorizontalAlign align;
    private Boolean floating;
    private String text;
    private Boolean useHTML;
    private VerticalAlign verticalAlign;
    private Number widthAdjust;
    private Number x;
    private Number y;
    private CSSObject style;

    public Subtitle(final String text) {
        this.style = new CSSObject();
        this.text = text;
    }

}
