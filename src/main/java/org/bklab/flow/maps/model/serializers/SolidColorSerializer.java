package org.bklab.flow.maps.model.serializers;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.Module;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.module.SimpleModule;
import org.bklab.flow.maps.model.style.SolidColor;

import java.io.IOException;

public class SolidColorSerializer extends JsonSerializer<SolidColor> {
    public static Module getModule() {
        final SimpleModule module = new SimpleModule();
        module.addSerializer((Class) SolidColor.class, (JsonSerializer) new SolidColorSerializer());
        return module;
    }

    public void serialize(final SolidColor value, final JsonGenerator gen, final SerializerProvider serializers) throws IOException {
        gen.writeString(value.toString());
    }
}
