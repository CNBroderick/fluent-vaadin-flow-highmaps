package org.bklab.flow.maps;

import com.fasterxml.jackson.annotation.JsonUnwrapped;
import com.vaadin.flow.component.ComponentUtil;
import com.vaadin.flow.component.UI;
import elemental.json.JsonObject;
import elemental.json.impl.JreJsonFactory;
import org.bklab.flow.maps.model.AbstractConfigurationObject;
import org.bklab.flow.maps.model.Lang;
import org.bklab.flow.maps.model.style.Theme;
import org.bklab.flow.maps.util.ChartSerialization;

import java.util.Objects;

public class MapOptions extends AbstractConfigurationObject {
    @JsonUnwrapped
    private Theme theme;
    private Lang lang;
    private transient JreJsonFactory jsonFactory;

    protected MapOptions() {
    }

    public static MapOptions get(final UI ui) {
        Objects.requireNonNull(ui, "Given UI may not be null");
        MapOptions options = ComponentUtil.getData(ui, MapOptions.class);
        if (options == null) {
            options = new MapOptions();
            ComponentUtil.setData(ui, MapOptions.class, options);
        }
        return options;
    }

    public static MapOptions get() {
        final UI ui = UI.getCurrent();
        if (ui == null) {
            throw new IllegalStateException("This method must be used from UI thread");
        }
        return get(ui);
    }

    private JreJsonFactory getJsonFactory() {
        if (this.jsonFactory == null) {
            this.jsonFactory = new JreJsonFactory();
        }
        return this.jsonFactory;
    }

    private MapOptions updateOptions() {
        final UI ui = UI.getCurrent();
        if (ui == null) {
            return this;
        }
        final JsonObject configurationNode = this.getJsonFactory().parse(ChartSerialization.toJSON(this));
        ui.getElement().executeJs("customElements.get('vaadin-map').__callHighchartsFunction('setOptions',$0,$1)", true, configurationNode);
        return this;
    }

    public Lang getLang() {
        return this.lang;
    }

    public MapOptions setLang(final Lang lang) {
        this.lang = lang;
        return this.updateOptions();
    }

    public Theme getTheme() {
        return this.theme;
    }

    public MapOptions setTheme(final Theme theme) {
        this.theme = theme;
        return this.updateOptions();
    }
}
