package org.bklab.broderick;

import com.google.gson.GsonBuilder;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.component.notification.Notification;
import com.vaadin.flow.component.notification.NotificationVariant;
import com.vaadin.flow.router.Route;
import elemental.json.Json;
import elemental.json.impl.JreJsonFactory;
import org.bklab.flow.maps.HighChatsMap;
import org.bklab.flow.maps.events.MapClickEvent;
import org.bklab.flow.maps.events.PointClickEvent;
import org.bklab.flow.maps.model.Configuration;
import org.bklab.flow.maps.model.MapDataSeries;
import org.bklab.flow.maps.model.PlotOptionsMap;
import org.bklab.flow.maps.model.PlotOptionsMappoint;

@Route("")
public class View extends Div {

    public View() {
        HighChatsMap highChatsMap = new HighChatsMap();
        Configuration config = highChatsMap.getConfiguration();

// put geojson to window.VaadinMaps.maps["germany"] variable in separate "js/maps/germany.js"
// file should be added to component via @JavaScript("js/maps/germany.js")
        config.getChart().setHeight(650);

        config.getLegend().setEnabled(false);
        config.setTitle("GeoJSON in Highmaps");
        MapDataSeries series = new MapDataSeries("Random data");
        series.setPlotOptions(new PlotOptionsMap());
        config.addSeries(series);

        MapDataSeries secondSeries = new MapDataSeries("Clicked points");
        PlotOptionsMappoint plotOptionsMappoint = new PlotOptionsMappoint();
        secondSeries.setPlotOptions(plotOptionsMappoint);
        plotOptionsMappoint.setStickyTracking(false);
        config.addSeries(secondSeries);

        highChatsMap.addMapClickListener(this::onClick);
        highChatsMap.addPointClickListener(this::onPointClick);
        add(highChatsMap);
    }

    private void onPointClick(PointClickEvent pointClickEvent) {
        Notification notification = new Notification(pointClickEvent.toString(), 5000, Notification.Position.TOP_END);
        notification.addThemeVariants(NotificationVariant.LUMO_PRIMARY);
        notification.open();
    }

    private void onClick(MapClickEvent mapClickEvent) {
        Notification notification = new Notification(mapClickEvent.toString(), 5000, Notification.Position.TOP_END);
        notification.addThemeVariants(NotificationVariant.LUMO_PRIMARY);
        notification.open();
    }


}
