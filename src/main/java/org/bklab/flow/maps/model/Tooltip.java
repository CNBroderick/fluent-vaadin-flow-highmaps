package org.bklab.flow.maps.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.Accessors;
import org.bklab.flow.maps.model.style.Color;
import org.bklab.flow.maps.model.style.Style;

@Getter
@Setter
@Accessors(chain = true)
@NoArgsConstructor
public class Tooltip extends AbstractConfigurationObject {
    private Boolean animation;
    private Color backgroundColor;
    private Color borderColor;
    private Number borderRadius;
    private Number borderWidth;
    private Boolean enabled;
    private Boolean followPointer;
    private Boolean followTouchMove;
    private String footerFormat;
    private String _fn_formatter;
    private String headerFormat;
    private Number hideDelay;
    private String pointFormat;
    private String _fn_pointFormatter;
    private String _fn_positioner;
    private Boolean shadow;
    private Style style;
    private Boolean useHTML;
    private Number valueDecimals;
    private String valuePrefix;
    private String valueSuffix;

    public Style getStyle() {
        if (this.style == null) {
            this.style = new Style();
        }
        return this.style;
    }

}
