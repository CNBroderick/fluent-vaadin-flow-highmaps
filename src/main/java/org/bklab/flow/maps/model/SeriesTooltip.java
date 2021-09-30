package org.bklab.flow.maps.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.Accessors;

@Getter
@Setter
@Accessors(chain = true)
@NoArgsConstructor
public class SeriesTooltip extends AbstractConfigurationObject {
    private Boolean followPointer;
    private Boolean followTouchMove;
    private String footerFormat;
    private String headerFormat;
    private Number hideDelay;
    private String pointFormat;
    private String _fn_pointFormatter;
    private Number valueDecimals;
    private String valuePrefix;
    private String valueSuffix;

}
