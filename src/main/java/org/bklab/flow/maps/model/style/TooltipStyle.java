package org.bklab.flow.maps.model.style;

import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;
import org.bklab.flow.maps.model.AbstractConfigurationObject;

@Getter
@Setter
@Accessors(chain = true)
public class TooltipStyle extends AbstractConfigurationObject {
    private Color backgroundColor;
    private Number borderWidth;
    private Number borderRadius;
    private Color borderColor;
    private Boolean followPointer = false;
    private Style style = new Style();


}
