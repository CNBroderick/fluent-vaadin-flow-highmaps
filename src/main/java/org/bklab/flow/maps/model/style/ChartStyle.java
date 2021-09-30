package org.bklab.flow.maps.model.style;

import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;
import org.bklab.flow.maps.model.AbstractConfigurationObject;

@Getter
@Setter
@Accessors(chain = true)
public class ChartStyle extends AbstractConfigurationObject {
    private Color backgroundColor;
    private Color plotBackgroundColor;
    private String plotBackgroundImage;
    private Boolean plotShadow;
    private Number plotBorderWidth;
    private Color plotBorderColor;
    private String className;
    private Number borderWidth;
    private Color borderColor;
    private Number borderRadius;
    private Style style;

}
