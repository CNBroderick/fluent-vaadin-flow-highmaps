package org.bklab.flow.maps.model.serializers;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.Module;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.module.SimpleModule;
import org.bklab.flow.maps.model.AxisList;

import java.io.IOException;

public class AxisListSerializer extends JsonSerializer<AxisList> {
    public static Module getModule() {
        final SimpleModule module = new SimpleModule();
        module.addSerializer((Class) AxisList.class, (JsonSerializer) new AxisListSerializer());
        return module;
    }

    public void serialize(final AxisList value, final JsonGenerator gen, final SerializerProvider serializers) throws IOException {
        if (value != null && value.getNumberOfAxes() == 1) {
            gen.writeObject(value.getAxis(0));
        } else if (value != null) {
            gen.writeObject(value.getAxes());
        }
    }
}
