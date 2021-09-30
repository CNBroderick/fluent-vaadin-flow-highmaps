package org.bklab.flow.maps.model;

import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;
import org.bklab.flow.maps.model.style.Color;

@Getter
@Setter
@Accessors(chain = true)
public class Stop extends AbstractConfigurationObject {
    private float position;
    private Color color;

    public Stop(final float position, final Color color) {
        this.position = position;
        this.color = color;
    }

}
