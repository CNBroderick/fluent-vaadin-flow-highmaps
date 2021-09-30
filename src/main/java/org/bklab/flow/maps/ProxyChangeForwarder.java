package org.bklab.flow.maps;

import org.bklab.flow.maps.events.internal.*;
import org.bklab.flow.maps.model.AbstractConfigurationObject;
import org.bklab.flow.maps.util.MapSerialization;

class ProxyChangeForwarder implements ConfigurationChangeListener<ProxyChangeForwarder> {
    private final HighChatsMap highChatsMap;

    ProxyChangeForwarder(final HighChatsMap highChatsMap) {
        this.highChatsMap = highChatsMap;
    }

    @Override
    public ProxyChangeForwarder dataAdded(final DataAddedEvent event) {
        if (event.getItem() != null) {
            this.highChatsMap.getElement().callJsFunction("__callSeriesFunction", "addPoint", this.getSeriesIndex(event), this.highChatsMap.getJsonFactory().parse(MapSerialization.toJSON(event.getItem())), true, event.isShift());
        }
        return this;
    }

    @Override
    public ProxyChangeForwarder dataRemoved(final DataRemovedEvent event) {
        this.highChatsMap.getElement().callJsFunction("__callPointFunction", "remove", this.getSeriesIndex(event), event.getIndex());
        return this;
    }

    @Override
    public ProxyChangeForwarder dataUpdated(final DataUpdatedEvent event) {
        if (event.getValue() != null) {
            this.highChatsMap.getElement().callJsFunction("__callPointFunction", "update", this.getSeriesIndex(event), event.getPointIndex(), event.getValue().doubleValue());
        } else {
            this.highChatsMap.getElement().callJsFunction("__callPointFunction", "update", this.getSeriesIndex(event), event.getPointIndex(), this.highChatsMap.getJsonFactory().parse(MapSerialization.toJSON(event.getItem())));
        }
        return this;
    }

    @Override
    public ProxyChangeForwarder seriesStateChanged(final SeriesStateEvent event) {
        if (event.isEnabled()) {
            this.highChatsMap.getElement().callJsFunction("__callSeriesFunction", "show", this.getSeriesIndex(event));
        } else {
            this.highChatsMap.getElement().callJsFunction("__callSeriesFunction", "hide", this.getSeriesIndex(event));
        }
        return this;
    }

    @Override
    public ProxyChangeForwarder axisRescaled(final AxisRescaledEvent event) {
        this.highChatsMap.getElement().callJsFunction("__callAxisFunction", "setExtremes", event.getAxis(), event.getAxisIndex(), event.getMinimum().doubleValue(), event.getMaximum().doubleValue(), event.isRedrawingNeeded(), event.isAnimated());
        return this;
    }

    @Override
    public ProxyChangeForwarder itemSliced(final ItemSlicedEvent event) {
        this.highChatsMap.getElement().callJsFunction("__callPointFunction", "slice", this.getSeriesIndex(event), event.getIndex(), event.isSliced(), event.isRedraw(), event.isAnimation());
        return this;
    }

    @Override
    public ProxyChangeForwarder seriesAdded(final SeriesAddedEvent event) {
        this.highChatsMap.getElement().callJsFunction("__callChartFunction", "addSeries", this.highChatsMap.getJsonFactory().parse(MapSerialization.toJSON((AbstractConfigurationObject) event.getSeries())));
        return this;
    }

    @Override
    public ProxyChangeForwarder seriesChanged(final SeriesChangedEvent event) {
        this.highChatsMap.getElement().callJsFunction("__callSeriesFunction", "update", this.getSeriesIndex(event), this.highChatsMap.getJsonFactory().parse(MapSerialization.toJSON((AbstractConfigurationObject) event.getSeries())));
        return this;
    }

    @Override
    public ProxyChangeForwarder resetZoom(final boolean redraw, final boolean animate) {
        this.highChatsMap.getElement().callJsFunction("__callChartFunction", "mapZoom");
        return this;
    }

    private int getSeriesIndex(final AbstractSeriesEvent event) {
        return this.highChatsMap.getConfiguration().getSeries().indexOf(event.getSeries());
    }
}
