package org.bklab.flow.maps.events;

import java.io.Serializable;

public class MouseEventDetails implements Serializable {
    private MouseButton button;
    private int screenX;
    private int screenY;
    private int absoluteX;
    private int absoluteY;
    private boolean altKey;
    private boolean ctrlKey;
    private boolean metaKey;
    private boolean shiftKey;
    private double xValue;
    private double yValue;

    public MouseButton getButton() {
        return this.button;
    }

    public void setButton(final MouseButton button) {
        this.button = button;
    }

    public int getAbsoluteX() {
        return this.absoluteX;
    }

    public void setAbsoluteX(final int absoluteX) {
        this.absoluteX = absoluteX;
    }

    public int getAbsoluteY() {
        return this.absoluteY;
    }

    public void setAbsoluteY(final int absoluteY) {
        this.absoluteY = absoluteY;
    }

    public int getScreenX() {
        return this.screenX;
    }

    public void setScreenX(final int screenX) {
        this.screenX = screenX;
    }

    public int getScreenY() {
        return this.screenY;
    }

    public void setScreenY(final int screenY) {
        this.screenY = screenY;
    }

    public boolean isAltKey() {
        return this.altKey;
    }

    public void setAltKey(final boolean altKey) {
        this.altKey = altKey;
    }

    public boolean isCtrlKey() {
        return this.ctrlKey;
    }

    public void setCtrlKey(final boolean ctrlKey) {
        this.ctrlKey = ctrlKey;
    }

    public boolean isMetaKey() {
        return this.metaKey;
    }

    public void setMetaKey(final boolean metaKey) {
        this.metaKey = metaKey;
    }

    public boolean isShiftKey() {
        return this.shiftKey;
    }

    public void setShiftKey(final boolean shiftKey) {
        this.shiftKey = shiftKey;
    }

    public double getxValue() {
        return this.xValue;
    }

    public void setxValue(final double xValue) {
        this.xValue = xValue;
    }

    public double getyValue() {
        return this.yValue;
    }

    public void setyValue(final double yValue) {
        this.yValue = yValue;
    }

    public String getButtonName() {
        return (this.button == null) ? "" : this.button.getName();
    }

    @Override
    public String toString() {
        return "MouseEventDetails{button=" + this.button + ", screenX=" + this.screenX + ", screenY=" + this.screenY + ", absoluteX=" + this.absoluteX + ", absoluteY=" + this.absoluteY + ", altKey=" + this.altKey + ", ctrlKey=" + this.ctrlKey + ", metaKey=" + this.metaKey + ", shiftKey=" + this.shiftKey + ", xValue=" + this.xValue + ", yValue=" + this.yValue + '}';
    }

    public enum MouseButton {
        LEFT("left"),
        RIGHT("right"),
        MIDDLE("middle");

        private final String name;

        MouseButton(final String name) {
            this.name = name;
        }

        public static MouseButton of(final int button) {
            switch (button) {
                case 0: {
                    return MouseButton.LEFT;
                }
                case 1: {
                    return MouseButton.MIDDLE;
                }
                default: {
                    return MouseButton.RIGHT;
                }
            }
        }

        public String getName() {
            return this.name;
        }
    }
}
