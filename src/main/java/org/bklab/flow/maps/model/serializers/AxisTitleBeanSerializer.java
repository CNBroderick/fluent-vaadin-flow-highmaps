package org.bklab.flow.maps.model.serializers;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.SerializerProvider;
import org.bklab.flow.maps.model.AxisTitle;

import java.io.IOException;

public class AxisTitleBeanSerializer extends BeanSerializationDelegate<AxisTitle> {
    @Override
    public Class<AxisTitle> getBeanClass() {
        return AxisTitle.class;
    }

    @Override
    public void serialize(final AxisTitle bean, final BeanSerializerDelegator<AxisTitle> serializer, final JsonGenerator jgen, final SerializerProvider provider) throws IOException {
        jgen.writeStartObject();
        if (bean != null && bean.getText() == null) {
            jgen.writeNullField("text");
        } else {
            serializer.serializeFields(bean, jgen, provider);
        }
        jgen.writeEndObject();
    }
}
