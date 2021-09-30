package org.bklab.flow.maps.model.serializers;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.SerializerProvider;
import org.bklab.flow.maps.model.AbstractSeries;
import org.bklab.flow.maps.model.PlotOptionsSeries;

import java.io.IOException;

public class AbstractSeriesBeanSerializer extends BeanSerializationDelegate<AbstractSeries> {
    @Override
    public Class<AbstractSeries> getBeanClass() {
        return AbstractSeries.class;
    }

    @Override
    public void serialize(final AbstractSeries bean, final BeanSerializerDelegator<AbstractSeries> serializer, final JsonGenerator jgen, final SerializerProvider provider) throws IOException {
        jgen.writeStartObject();
        serializer.serializeFields(bean, jgen, provider);
        if (bean.getPlotOptions() != null && !(bean.getPlotOptions() instanceof PlotOptionsSeries)) {
            jgen.writeObjectField("type", bean.getPlotOptions().getMapType());
        }
        jgen.writeEndObject();
    }
}
