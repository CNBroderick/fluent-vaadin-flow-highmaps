package org.bklab.flow.maps.model.serializers;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.SerializerProvider;
import org.bklab.flow.maps.model.LegendTitle;

import java.io.IOException;

public class LegendTitleBeanSerializer extends BeanSerializationDelegate<LegendTitle> {
    @Override
    public Class<LegendTitle> getBeanClass() {
        return LegendTitle.class;
    }

    @Override
    public void serialize(final LegendTitle bean, final BeanSerializerDelegator<LegendTitle> serializer, final JsonGenerator jgen, final SerializerProvider provider) throws IOException {
        jgen.writeStartObject();
        if (bean != null && bean.getText() == null) {
            jgen.writeNullField("text");
        } else {
            serializer.serializeFields(bean, jgen, provider);
        }
        jgen.writeEndObject();
    }
}
