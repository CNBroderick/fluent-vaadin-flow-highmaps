package org.bklab.flow.maps.model;

import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

@Getter
@Setter
@Accessors(chain = true)
public class Accessibility extends AbstractConfigurationObject {
    private Boolean describeSingleSeries;
    private Boolean enabled;
    private KeyboardNavigation keyboardNavigation;
    private String _fn_onTableAnchorClick;
    private String pointDateFormat;
    private String _fn_pointDateFormatter;
    private String _fn_pointDescriptionFormatter;
    private String _fn_screenReaderSectionFormatter;
    private String _fn_seriesDescriptionFormatter;

    public Accessibility() {
    }

    public Accessibility(final Boolean enabled) {
        this.enabled = enabled;
    }

    public Boolean getDescribeSingleSeries() {
        return this.describeSingleSeries;
    }

    public void setDescribeSingleSeries(final Boolean describeSingleSeries) {
        this.describeSingleSeries = describeSingleSeries;
    }

    public Boolean getEnabled() {
        return this.enabled;
    }

    public void setEnabled(final Boolean enabled) {
        this.enabled = enabled;
    }

    public KeyboardNavigation getKeyboardNavigation() {
        if (this.keyboardNavigation == null) {
            this.keyboardNavigation = new KeyboardNavigation();
        }
        return this.keyboardNavigation;
    }

}
