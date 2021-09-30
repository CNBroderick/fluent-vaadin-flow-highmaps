package org.bklab.flow.maps.model;

public class Global extends AbstractConfigurationObject {
    private String VMLRadialGradientURL;
    private String canvasToolsURL;
    private Boolean useUTC;

    public String getVMLRadialGradientURL() {
        return this.VMLRadialGradientURL;
    }

    public void setVMLRadialGradientURL(final String VMLRadialGradientURL) {
        this.VMLRadialGradientURL = VMLRadialGradientURL;
    }

    public String getCanvasToolsURL() {
        return this.canvasToolsURL;
    }

    public void setCanvasToolsURL(final String canvasToolsURL) {
        this.canvasToolsURL = canvasToolsURL;
    }

    public Boolean getUseUTC() {
        return this.useUTC;
    }

    public void setUseUTC(final Boolean useUTC) {
        this.useUTC = useUTC;
    }
}
