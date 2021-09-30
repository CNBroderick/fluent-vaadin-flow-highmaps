package org.bklab.flow.maps.model;

import org.bklab.flow.maps.model.style.ButtonTheme;

public class DrillUpButton extends AbstractConfigurationObject {
    private ButtonPosition position;
    private DrillUpButtonRelativeTo relativeTo;
    private ButtonTheme theme;

    public ButtonPosition getPosition() {
        return this.position;
    }

    public void setPosition(final ButtonPosition position) {
        this.position = position;
    }

    public DrillUpButtonRelativeTo getRelativeTo() {
        return this.relativeTo;
    }

    public void setRelativeTo(final DrillUpButtonRelativeTo relativeTo) {
        this.relativeTo = relativeTo;
    }

    public ButtonTheme getTheme() {
        return this.theme;
    }

    public void setTheme(final ButtonTheme theme) {
        this.theme = theme;
    }
}
