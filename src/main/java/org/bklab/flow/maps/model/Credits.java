package org.bklab.flow.maps.model;

import org.bklab.flow.maps.model.style.Style;

public class Credits extends AbstractConfigurationObject {
    private Boolean enabled;
    private String href;
    private String mapText;
    private String mapTextFull;
    private Position position;
    private Style style;
    private String text;

    public Credits() {
    }

    public Credits(final Boolean enabled) {
        this.enabled = enabled;
    }

    public Credits(final String text) {
        this.text = text;
    }

    public Boolean getEnabled() {
        return this.enabled;
    }

    public void setEnabled(final Boolean enabled) {
        this.enabled = enabled;
    }

    public String getHref() {
        return this.href;
    }

    public void setHref(final String href) {
        this.href = href;
    }

    public String getMapText() {
        return this.mapText;
    }

    public void setMapText(final String mapText) {
        this.mapText = mapText;
    }

    public String getMapTextFull() {
        return this.mapTextFull;
    }

    public void setMapTextFull(final String mapTextFull) {
        this.mapTextFull = mapTextFull;
    }

    public Position getPosition() {
        if (this.position == null) {
            this.position = new Position();
        }
        return this.position;
    }

    public void setPosition(final Position position) {
        this.position = position;
    }

    public Style getStyle() {
        if (this.style == null) {
            this.style = new Style();
        }
        return this.style;
    }

    public void setStyle(final Style style) {
        this.style = style;
    }

    public String getText() {
        return this.text;
    }

    public void setText(final String text) {
        this.text = text;
    }
}
