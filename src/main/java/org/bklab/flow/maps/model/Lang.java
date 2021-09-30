package org.bklab.flow.maps.model;

public class Lang extends AbstractConfigurationObject {
    private String contextButtonTitle;
    private String decimalPoint;
    private String downloadJPEG;
    private String downloadPDF;
    private String downloadPNG;
    private String downloadSVG;
    private String drillUpText;
    private String loading;
    private String[] months;
    private String[] numericSymbols;
    private String printChart;
    private String resetZoom;
    private String resetZoomTitle;
    private String[] shortMonths;
    private String[] shortWeekdays;
    private String thousandsSep;
    private String[] weekdays;
    private ZoomIn zoomIn;
    private ZoomOut zoomOut;

    public String getContextButtonTitle() {
        return this.contextButtonTitle;
    }

    public void setContextButtonTitle(final String contextButtonTitle) {
        this.contextButtonTitle = contextButtonTitle;
    }

    public String getDecimalPoint() {
        return this.decimalPoint;
    }

    public void setDecimalPoint(final String decimalPoint) {
        this.decimalPoint = decimalPoint;
    }

    public String getDownloadJPEG() {
        return this.downloadJPEG;
    }

    public void setDownloadJPEG(final String downloadJPEG) {
        this.downloadJPEG = downloadJPEG;
    }

    public String getDownloadPDF() {
        return this.downloadPDF;
    }

    public void setDownloadPDF(final String downloadPDF) {
        this.downloadPDF = downloadPDF;
    }

    public String getDownloadPNG() {
        return this.downloadPNG;
    }

    public void setDownloadPNG(final String downloadPNG) {
        this.downloadPNG = downloadPNG;
    }

    public String getDownloadSVG() {
        return this.downloadSVG;
    }

    public void setDownloadSVG(final String downloadSVG) {
        this.downloadSVG = downloadSVG;
    }

    public String getDrillUpText() {
        return this.drillUpText;
    }

    public void setDrillUpText(final String drillUpText) {
        this.drillUpText = drillUpText;
    }

    public String getLoading() {
        return this.loading;
    }

    public void setLoading(final String loading) {
        this.loading = loading;
    }

    public String[] getMonths() {
        return this.months;
    }

    public void setMonths(final String[] months) {
        this.months = months;
    }

    public String[] getNumericSymbols() {
        return this.numericSymbols;
    }

    public void setNumericSymbols(final String[] numericSymbols) {
        this.numericSymbols = numericSymbols;
    }

    public String getPrintChart() {
        return this.printChart;
    }

    public void setPrintChart(final String printChart) {
        this.printChart = printChart;
    }

    public String getResetZoom() {
        return this.resetZoom;
    }

    public void setResetZoom(final String resetZoom) {
        this.resetZoom = resetZoom;
    }

    public String getResetZoomTitle() {
        return this.resetZoomTitle;
    }

    public void setResetZoomTitle(final String resetZoomTitle) {
        this.resetZoomTitle = resetZoomTitle;
    }

    public String[] getShortMonths() {
        return this.shortMonths;
    }

    public void setShortMonths(final String[] shortMonths) {
        this.shortMonths = shortMonths;
    }

    public String[] getShortWeekdays() {
        return this.shortWeekdays;
    }

    public void setShortWeekdays(final String[] shortWeekdays) {
        this.shortWeekdays = shortWeekdays;
    }

    public String getThousandsSep() {
        return this.thousandsSep;
    }

    public void setThousandsSep(final String thousandsSep) {
        this.thousandsSep = thousandsSep;
    }

    public String[] getWeekdays() {
        return this.weekdays;
    }

    public void setWeekdays(final String[] weekdays) {
        this.weekdays = weekdays;
    }

    public ZoomIn getZoomIn() {
        if (this.zoomIn == null) {
            this.zoomIn = new ZoomIn();
        }
        return this.zoomIn;
    }

    public void setZoomIn(final ZoomIn zoomIn) {
        this.zoomIn = zoomIn;
    }

    public ZoomOut getZoomOut() {
        if (this.zoomOut == null) {
            this.zoomOut = new ZoomOut();
        }
        return this.zoomOut;
    }

    public void setZoomOut(final ZoomOut zoomOut) {
        this.zoomOut = zoomOut;
    }
}
