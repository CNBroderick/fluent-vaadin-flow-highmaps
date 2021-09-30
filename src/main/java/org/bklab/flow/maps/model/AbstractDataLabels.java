package org.bklab.flow.maps.model;

import org.bklab.flow.maps.model.style.Color;
import org.bklab.flow.maps.model.style.Style;

public abstract class AbstractDataLabels extends AbstractConfigurationObject {
    public abstract Color getBackgroundColor();

    public abstract void setBackgroundColor(final Color p0);

    public abstract Color getBorderColor();

    public abstract void setBorderColor(final Color p0);

    public abstract Number getBorderRadius();

    public abstract void setBorderRadius(final Number p0);

    public abstract Number getBorderWidth();

    public abstract void setBorderWidth(final Number p0);

    public abstract Color getColor();

    public abstract void setColor(final Color p0);

    public abstract Boolean getCrop();

    public abstract void setCrop(final Boolean p0);

    public abstract void setEnabled(final Boolean p0);

    public abstract String getFormat();

    public abstract void setFormat(final String p0);

    public abstract String getFormatter();

    public abstract void setFormatter(final String p0);

    public abstract String getOverflow();

    public abstract void setOverflow(final String p0);

    public abstract Number getPadding();

    public abstract void setPadding(final Number p0);

    public abstract Number getRotation();

    public abstract void setRotation(final Number p0);

    public abstract Boolean getShadow();

    public abstract void setShadow(final Boolean p0);

    public abstract Shape getShape();

    public abstract void setShape(final Shape p0);

    public abstract Style getStyle();

    public abstract void setStyle(final Style p0);

    public abstract Boolean getUseHTML();

    public abstract void setUseHTML(final Boolean p0);

    public abstract VerticalAlign getVerticalAlign();

    public abstract void setVerticalAlign(final VerticalAlign p0);
}
