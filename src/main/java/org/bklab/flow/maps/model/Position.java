package org.bklab.flow.maps.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.Accessors;

@Getter
@Setter
@Accessors(chain = true)
@NoArgsConstructor
public class Position extends AbstractConfigurationObject {
    private VerticalAlign verticalAlign;
    private HorizontalAlign align;
    private Number x;
    private Number y;

}
