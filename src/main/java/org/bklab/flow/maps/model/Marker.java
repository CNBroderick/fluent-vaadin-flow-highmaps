package org.bklab.flow.maps.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.Accessors;
import org.bklab.flow.maps.model.style.Color;

@Getter
@Setter
@Accessors(chain = true)
@NoArgsConstructor
public class Marker extends AbstractConfigurationObject {
    private Boolean animation;
    private Color color;

}
