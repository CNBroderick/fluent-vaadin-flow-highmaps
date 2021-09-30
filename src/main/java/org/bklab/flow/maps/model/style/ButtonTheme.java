package org.bklab.flow.maps.model.style;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;
import org.bklab.flow.maps.model.AbstractConfigurationObject;

@Getter
@Setter
@Accessors(chain = true)
public class ButtonTheme extends AbstractConfigurationObject {
    private Color fill;
    private Color stroke;
    @JsonProperty("stroke-width")
    private Number strokeWidth;
    private Style style;
    @JsonInclude(JsonInclude.Include.NON_DEFAULT)
    private Number width;

    public ButtonTheme() {
        this.width = 32;
    }
}
