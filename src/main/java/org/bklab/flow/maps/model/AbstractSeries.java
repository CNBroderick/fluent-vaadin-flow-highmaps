package org.bklab.flow.maps.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonUnwrapped;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.Accessors;

@Getter
@Setter
@Accessors(chain = true)
@NoArgsConstructor
public abstract class AbstractSeries extends AbstractConfigurationObject implements Series<AbstractSeries> {
    private String name;
    private String id;
    @JsonUnwrapped
    private AbstractPlotOptions plotOptions;
    private Boolean visible;
    @JsonIgnore
    private Configuration configuration;
    private Integer xAxis;
    private Integer yAxis;

    public AbstractSeries(final String name) {
        this.setName(name);
    }


    public void setVisible(final Boolean visible) {
        this.setVisible(visible, true);
    }

    public void setVisible(final Boolean visible, final boolean updateMapImmediately) {
        final boolean doDynamicChange = updateMapImmediately && this.getConfiguration() != null && this.visible != visible;
        this.visible = visible;
        if (doDynamicChange) {
            this.getConfiguration().fireSeriesEnabled(this, visible);
        }
    }

    public Boolean isVisible() {
        if (this.visible == null) {
            return Boolean.TRUE;
        }
        return this.visible;
    }

    public void setxAxis(final Integer xAxis) {
        this.xAxis = xAxis;
    }


    public void setyAxis(final Integer yAxis) {
        this.yAxis = yAxis;
    }

    public void setyAxis(final YAxis secondaryAxis) {
        if (this.configuration == null) {
            throw new IllegalStateException("This method must be called only when series is attached to configuration options");
        }
        final int indexOf = this.configuration.getyAxes().indexOf(secondaryAxis);
        if (indexOf == -1) {
            throw new IllegalStateException("This method can only be used if axis is already attached to the same configuration object");
        }
        this.setyAxis(indexOf);
    }

    public void updateSeries() {
        if (this.getConfiguration() != null) {
            this.getConfiguration().fireSeriesChanged(this);
        }
    }
}
