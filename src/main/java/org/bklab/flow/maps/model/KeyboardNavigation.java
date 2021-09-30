package org.bklab.flow.maps.model;

public class KeyboardNavigation extends AbstractConfigurationObject {
    private Boolean enabled;
    private Boolean skipNullPoints;
    private Boolean tabThroughChartElements;

    public KeyboardNavigation() {
    }

    public KeyboardNavigation(final Boolean enabled) {
        this.enabled = enabled;
    }

    public Boolean getEnabled() {
        return this.enabled;
    }

    public void setEnabled(final Boolean enabled) {
        this.enabled = enabled;
    }

    public Boolean getSkipNullPoints() {
        return this.skipNullPoints;
    }

    public void setSkipNullPoints(final Boolean skipNullPoints) {
        this.skipNullPoints = skipNullPoints;
    }

    public Boolean getTabThroughChartElements() {
        return this.tabThroughChartElements;
    }

    public void setTabThroughChartElements(final Boolean tabThroughChartElements) {
        this.tabThroughChartElements = tabThroughChartElements;
    }
}
