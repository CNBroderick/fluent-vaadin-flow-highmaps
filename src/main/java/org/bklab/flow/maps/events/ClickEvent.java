package org.bklab.flow.maps.events;

import java.io.Serializable;

public interface ClickEvent extends Serializable {
    MouseEventDetails getMouseDetails();

    default double getxAxisValue() {
        return this.getMouseDetails().getxValue();
    }

    default double getyAxisValue() {
        return this.getMouseDetails().getyValue();
    }

    default int getAbsoluteX() {
        return this.getMouseDetails().getAbsoluteX();
    }

    default int getAbsoluteY() {
        return this.getMouseDetails().getAbsoluteY();
    }

    default MouseEventDetails.MouseButton getButton() {
        return this.getMouseDetails().getButton();
    }

    default boolean isAltKey() {
        return this.getMouseDetails().isAltKey();
    }

    default boolean isCtrlKey() {
        return this.getMouseDetails().isCtrlKey();
    }

    default boolean isMetaKey() {
        return this.getMouseDetails().isMetaKey();
    }

    default boolean isShiftKey() {
        return this.getMouseDetails().isShiftKey();
    }
}
