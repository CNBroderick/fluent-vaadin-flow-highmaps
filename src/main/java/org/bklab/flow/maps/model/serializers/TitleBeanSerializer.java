package org.bklab.flow.maps.model.serializers;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.SerializerProvider;
import org.bklab.flow.maps.model.Title;

import java.io.IOException;

public class TitleBeanSerializer extends BeanSerializationDelegate<Title> {
    @Override
    public void serialize(final Title bean, final BeanSerializerDelegator<Title> serializer, final JsonGenerator jgen, final SerializerProvider provider) throws IOException {
        jgen.writeStartObject();
        if (bean != null && bean.getText() == null) {
            jgen.writeNullField("text");
        } else {
            serializer.serializeFields(bean, jgen, provider);
        }
        jgen.writeEndObject();
    }

    @Override
    public Class<Title> getBeanClass() {
        return Title.class;
    }
}
