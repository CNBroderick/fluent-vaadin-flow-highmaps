package org.bklab.flow.maps.model;

import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;
import org.bklab.flow.maps.model.style.Color;
import org.bklab.flow.maps.model.style.Style;

@Getter
@Setter
@Accessors(chain = true)
public class MapModel extends AbstractConfigurationObject {
    private Boolean animation;
    private Color backgroundColor;
    private Color borderColor;
    private Number borderRadius;
    private Number borderWidth;
    private String className;
    private Number height;
    private Number[] margin;
    private Number marginBottom;
    private Number marginLeft;
    private Number marginRight;
    private Number marginTop;
    private Color plotBackgroundColor;
    private String plotBackgroundImage;
    private Color plotBorderColor;
    private Number plotBorderWidth;
    private Boolean plotShadow;
    private Boolean reflow;
    private ResetZoomButton resetZoomButton;
    private Color selectionMarkerFill;
    private Boolean shadow;
    private Number[] spacing;
    private Number spacingBottom;
    private Number spacingLeft;
    private Number spacingRight;
    private Number spacingTop;
    private Style style;
    private MapType type;
    private Number width;
    private String map;
    private Boolean styledMode;

    public ResetZoomButton getResetZoomButton() {
        if (this.resetZoomButton == null) {
            this.resetZoomButton = new ResetZoomButton();
        }
        return this.resetZoomButton;
    }

    public Style getStyle() {
        if (this.style == null) {
            this.style = new Style();
        }
        return this.style;
    }

    public void setMargin(final Number vertical, final Number horizontal) {
        this.setMargin(vertical, horizontal, vertical, horizontal);
    }

    public void setMargin(final Number top, final Number right, final Number bottom, final Number left) {
        this.margin = new Number[]{top, right, bottom, left};
    }

}
