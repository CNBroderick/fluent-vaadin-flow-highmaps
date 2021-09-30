package org.bklab.flow.maps.model;

public class Buttons extends AbstractConfigurationObject {
    private ContextButton contextButton;

    public ContextButton getContextButton() {
        if (this.contextButton == null) {
            this.contextButton = new ContextButton();
        }
        return this.contextButton;
    }

    public void setContextButton(final ContextButton contextButton) {
        this.contextButton = contextButton;
    }
}
