package org.bklab.flow.maps.model.style;

import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;
import org.bklab.flow.maps.model.AbstractConfigurationObject;

@Getter
@Setter
@Accessors(chain = true)
public class Style extends AbstractConfigurationObject {
    private Color color;
    private FontWeight fontWeight;
    private String fontFamily;
    private String fontSize;
    private String left;
    private String top;
    private StylePosition position;
    private String lineHeight;
    private String textShadow;

}
