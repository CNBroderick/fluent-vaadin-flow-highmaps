package org.bklab.flow.maps.model.style;

import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;
import org.bklab.flow.maps.model.AbstractConfigurationObject;

@Getter
@Setter
@Accessors(chain = true)
public class StyleWrapper extends AbstractConfigurationObject {
    private Style style;

    public StyleWrapper() {
        this.style = new Style();
    }

}
