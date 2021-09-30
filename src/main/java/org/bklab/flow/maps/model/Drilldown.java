package org.bklab.flow.maps.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.ArrayList;
import java.util.List;

public class Drilldown extends AbstractConfigurationObject {
    private Boolean allowPointDrilldown;
    private Boolean animation;
    private DrillUpButton drillUpButton;
    private final List<Series> series;
    @JsonIgnore
    private Configuration configuration;

    public Drilldown() {
        this.series = new ArrayList<Series>();
    }

    void addSeries(final Series series) {
        this.series.add(series);
    }

    @JsonIgnoreProperties
    public Configuration getConfiguration() {
        return this.configuration;
    }

    public void setConfiguration(final Configuration configuration) {
        this.configuration = configuration;
    }

    public Boolean getAnimation() {
        return this.animation;
    }

    public void setAnimation(final Boolean animation) {
        this.animation = animation;
    }

    public DrillUpButton getDrillUpButton() {
        if (this.drillUpButton == null) {
            this.drillUpButton = new DrillUpButton();
        }
        return this.drillUpButton;
    }

    public void setDrillUpButton(final DrillUpButton drillUpButton) {
        this.drillUpButton = drillUpButton;
    }

    public Boolean getAllowPointDrilldown() {
        return this.allowPointDrilldown;
    }

    public void setAllowPointDrilldown(final Boolean allowPointDrilldown) {
        this.allowPointDrilldown = allowPointDrilldown;
    }
}
