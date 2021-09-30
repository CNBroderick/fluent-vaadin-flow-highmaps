package org.bklab.flow.maps.model;

public class Exporting extends AbstractConfigurationObject {
    private Boolean allowHTML;
    private Buttons buttons;
    private Boolean enabled;
    private Boolean fallbackToExportServer;
    private String filename;
    private Number printMaxWidth;
    private Number scale;
    private Number sourceHeight;
    private Number sourceWidth;
    private String type;
    private String url;
    private Number width;

    public Exporting() {
    }

    public Exporting(final Boolean enabled) {
        this.enabled = enabled;
    }

    public Boolean getAllowHTML() {
        return this.allowHTML;
    }

    public void setAllowHTML(final Boolean allowHTML) {
        this.allowHTML = allowHTML;
    }

    public Buttons getButtons() {
        if (this.buttons == null) {
            this.buttons = new Buttons();
        }
        return this.buttons;
    }

    public void setButtons(final Buttons buttons) {
        this.buttons = buttons;
    }

    public Boolean getEnabled() {
        return this.enabled;
    }

    public void setEnabled(final Boolean enabled) {
        this.enabled = enabled;
    }

    public Boolean getFallbackToExportServer() {
        return this.fallbackToExportServer;
    }

    public void setFallbackToExportServer(final Boolean fallbackToExportServer) {
        this.fallbackToExportServer = fallbackToExportServer;
    }

    public String getFilename() {
        return this.filename;
    }

    public void setFilename(final String filename) {
        this.filename = filename;
    }

    public Number getPrintMaxWidth() {
        return this.printMaxWidth;
    }

    public void setPrintMaxWidth(final Number printMaxWidth) {
        this.printMaxWidth = printMaxWidth;
    }

    public Number getScale() {
        return this.scale;
    }

    public void setScale(final Number scale) {
        this.scale = scale;
    }

    public Number getSourceHeight() {
        return this.sourceHeight;
    }

    public void setSourceHeight(final Number sourceHeight) {
        this.sourceHeight = sourceHeight;
    }

    public Number getSourceWidth() {
        return this.sourceWidth;
    }

    public void setSourceWidth(final Number sourceWidth) {
        this.sourceWidth = sourceWidth;
    }

    public String getType() {
        return this.type;
    }

    public void setType(final String type) {
        this.type = type;
    }

    public String getUrl() {
        return this.url;
    }

    public void setUrl(final String url) {
        this.url = url;
    }

    public Number getWidth() {
        return this.width;
    }

    public void setWidth(final Number width) {
        this.width = width;
    }
}
