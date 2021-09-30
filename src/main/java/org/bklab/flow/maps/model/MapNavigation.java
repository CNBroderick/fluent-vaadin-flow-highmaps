package org.bklab.flow.maps.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.Accessors;

@Getter
@Setter
@Accessors(chain = true)
@NoArgsConstructor
public class MapNavigation extends AbstractConfigurationObject {
    private ButtonOptions buttonOptions;
    private MapNavigationButtons buttons;
    private Boolean enableButtons;
    private Boolean enableDoubleClickZoom;
    private Boolean enableDoubleClickZoomTo;
    private Boolean enableMouseWheelZoom;
    private Boolean enableTouchZoom;
    private Boolean enabled;
    private Number mouseWheelSensitivity;

    public MapNavigation(final Boolean enabled) {
        this.enabled = enabled;
    }

    public ButtonOptions getButtonOptions() {
        if (this.buttonOptions == null) {
            this.buttonOptions = new ButtonOptions();
        }
        return this.buttonOptions;
    }

    public MapNavigationButtons getButtons() {
        if (this.buttons == null) {
            this.buttons = new MapNavigationButtons();
        }
        return this.buttons;
    }

}
