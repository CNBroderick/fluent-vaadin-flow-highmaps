package org.bklab.flow.maps;

import com.vaadin.flow.component.*;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.dependency.NpmPackage;
import com.vaadin.flow.shared.Registration;
import elemental.json.JsonObject;
import elemental.json.impl.JreJsonFactory;
import org.bklab.flow.maps.events.*;
import org.bklab.flow.maps.events.internal.ConfigurationChangeListener;
import org.bklab.flow.maps.model.Configuration;
import org.bklab.flow.maps.model.MapDataSeries;
import org.bklab.flow.maps.util.MapSerialization;

@Tag("high-charts-map")
@NpmPackage(value = "highcharts", version = "9.2.2")
@JsModule("./org/bklab/flow/maps/high-charts-map.js")
public class HighChatsMap extends Component implements HasSize, HasStyle {
    private final ConfigurationChangeListener<?> changeListener;
    private final Configuration configuration;
    private transient JreJsonFactory jsonFactory;

    public HighChatsMap() {
        this.jsonFactory = new JreJsonFactory();
        this.changeListener = new org.bklab.flow.maps.ProxyChangeForwarder(this);
        (this.configuration = new Configuration()).getxAxis();
        this.configuration.getyAxis();
    }

    public HighChatsMap setMapData(JsonObject mapData) {
        return setMapData(mapData.toJson());
    }

    public HighChatsMap setMapData(String mapData) {
        getElement().setProperty("_mapData", mapData);
        return this;
    }

    protected void onAttach(final AttachEvent attachEvent) {
        super.onAttach(attachEvent);
        attachEvent.getUI().beforeClientResponse(this, context -> {
            this.drawMap(false);
            if (this.configuration != null) {
                this.configuration.addChangeListener(this.changeListener);
            }
        });
    }

    JreJsonFactory getJsonFactory() {
        if (this.jsonFactory == null) {
            this.jsonFactory = new JreJsonFactory();
        }
        return this.jsonFactory;
    }

    public HighChatsMap drawMap(final boolean resetConfiguration) {
        final JsonObject configurationNode = this.getJsonFactory().parse(MapSerialization.toJSON(this.configuration));
        this.getElement().callJsFunction("update", configurationNode, resetConfiguration);
        return this;
    }

    public HighChatsMap setVisibilityTogglingDisabled(final boolean disabled) {
        this.getElement().setProperty("_visibilityTogglingDisabled", disabled);
        return this;
    }

    public Configuration getConfiguration() {
        return this.configuration;
    }

    public Registration addMapAddSeriesListener(final ComponentEventListener<MapAddSeriesEvent> listener) {
        return this.addListener(MapAddSeriesEvent.class, listener);
    }

    public Registration addMapAfterPrintListener(final ComponentEventListener<MapAfterPrintEvent> listener) {
        return this.addListener(MapAfterPrintEvent.class, listener);
    }

    public Registration addMapBeforePrintListener(final ComponentEventListener<MapBeforePrintEvent> listener) {
        return this.addListener(MapBeforePrintEvent.class, listener);
    }

    public Registration addMapClickListener(final ComponentEventListener<MapClickEvent> listener) {
        return this.addListener(MapClickEvent.class, listener);
    }

    public Registration addMapDrillupListener(final ComponentEventListener<MapDrillupEvent> listener) {
        return this.addListener(MapDrillupEvent.class, listener);
    }

    public Registration addMapDrillupAllListener(final ComponentEventListener<MapDrillupAllEvent> listener) {
        return this.addListener(MapDrillupAllEvent.class, listener);
    }

    public Registration addMapLoadListener(final ComponentEventListener<MapLoadEvent> listener) {
        return this.addListener(MapLoadEvent.class, listener);
    }

    public Registration addMapRedrawListener(final ComponentEventListener<MapRedrawEvent> listener) {
        return this.addListener(MapRedrawEvent.class, listener);
    }

    public Registration addCheckBoxClickListener(final ComponentEventListener<SeriesCheckboxClickEvent> listener) {
        return this.addListener(SeriesCheckboxClickEvent.class, listener);
    }

    public Registration addDrilldownListener(final ComponentEventListener<DrilldownEvent> listener) {
        return this.addListener(DrilldownEvent.class, listener);
    }

    public Registration addMapSelectionListener(final ComponentEventListener<MapSelectionEvent> listener) {
        return this.addListener(MapSelectionEvent.class, listener);
    }

    public Registration addSeriesLegendItemClickListener(final ComponentEventListener<SeriesLegendItemClickEvent> listener) {
        return this.addListener(SeriesLegendItemClickEvent.class, listener);
    }

    public Registration addPointLegendItemClickListener(final ComponentEventListener<PointLegendItemClickEvent> listener) {
        return this.addListener(PointLegendItemClickEvent.class, listener);
    }

    public Registration addSeriesAfterAnimateListener(final ComponentEventListener<SeriesAfterAnimateEvent> listener) {
        return this.addListener(SeriesAfterAnimateEvent.class, listener);
    }

    public Registration addSeriesClickListener(final ComponentEventListener<SeriesClickEvent> listener) {
        return this.addListener(SeriesClickEvent.class, listener);
    }

    public Registration addSeriesHideListener(final ComponentEventListener<SeriesHideEvent> listener) {
        return this.addListener(SeriesHideEvent.class, listener);
    }

    public Registration addSeriesMouseOutListener(final ComponentEventListener<SeriesMouseOutEvent> listener) {
        return this.addListener(SeriesMouseOutEvent.class, listener);
    }

    public Registration addSeriesMouseOverListener(final ComponentEventListener<SeriesMouseOverEvent> listener) {
        return this.addListener(SeriesMouseOverEvent.class, listener);
    }

    public Registration addSeriesShowListener(final ComponentEventListener<SeriesShowEvent> listener) {
        return this.addListener(SeriesShowEvent.class, listener);
    }

    public Registration addPointClickListener(final ComponentEventListener<PointClickEvent> listener) {
        return this.addListener(PointClickEvent.class, listener);
    }

    public Registration addPointMouseOutListener(final ComponentEventListener<PointMouseOutEvent> listener) {
        return this.addListener(PointMouseOutEvent.class, listener);
    }

    public Registration addPointMouseOverListener(final ComponentEventListener<PointMouseOverEvent> listener) {
        return this.addListener(PointMouseOverEvent.class, listener);
    }

    public Registration addPointRemoveListener(final ComponentEventListener<PointRemoveEvent> listener) {
        return this.addListener(PointRemoveEvent.class, listener);
    }

    public Registration addPointSelectListener(final ComponentEventListener<PointSelectEvent> listener) {
        return this.addListener(PointSelectEvent.class, listener);
    }

    public Registration addPointUnselectListener(final ComponentEventListener<PointUnselectEvent> listener) {
        return this.addListener(PointUnselectEvent.class, listener);
    }

    public Registration addPointUpdateListener(final ComponentEventListener<PointUpdateEvent> listener) {
        return this.addListener(PointUpdateEvent.class, listener);
    }

    public Registration addXAxesExtremesSetListener(final ComponentEventListener<XAxesExtremesSetEvent> listener) {
        return this.addListener(XAxesExtremesSetEvent.class, listener);
    }

    public Registration addYAxesExtremesSetListener(final ComponentEventListener<YAxesExtremesSetEvent> listener) {
        return this.addListener(YAxesExtremesSetEvent.class, listener);
    }

    public HighChatsMap addSeriesAsDrilldown(final String pointId, final MapDataSeries series) {
        series.setConfiguration(this.getConfiguration());
        this.getElement().callJsFunction("__addSeriesAsDrilldown", pointId, this.getJsonFactory().parse(MapSerialization.toJSON(series)));
        return this;
    }
}
