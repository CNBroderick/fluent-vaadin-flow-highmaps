package org.bklab.flow.maps.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.Accessors;
import org.bklab.flow.maps.model.style.Style;

@Getter
@Setter
@Accessors(chain = true)
@NoArgsConstructor
public class Navigation extends AbstractConfigurationObject {
    private ButtonOptions buttonOptions;
    private Style menuItemHoverStyle;
    private Style menuItemStyle;
    private Style menuStyle;

    public ButtonOptions getButtonOptions() {
        if (this.buttonOptions == null) {
            this.buttonOptions = new ButtonOptions();
        }
        return this.buttonOptions;
    }

    public Style getMenuItemHoverStyle() {
        if (this.menuItemHoverStyle == null) {
            this.menuItemHoverStyle = new Style();
        }
        return this.menuItemHoverStyle;
    }

    public Style getMenuItemStyle() {
        if (this.menuItemStyle == null) {
            this.menuItemStyle = new Style();
        }
        return this.menuItemStyle;
    }

    public Style getMenuStyle() {
        if (this.menuStyle == null) {
            this.menuStyle = new Style();
        }
        return this.menuStyle;
    }

}
