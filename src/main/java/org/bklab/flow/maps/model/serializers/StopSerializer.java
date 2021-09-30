package org.bklab.flow.maps.model.serializers;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.Module;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.module.SimpleModule;
import org.bklab.flow.maps.model.Stop;

import java.io.IOException;

public class StopSerializer extends JsonSerializer<Stop> {
    public static Module getModule() {
        final SimpleModule module = new SimpleModule();
        module.addSerializer((Class) Stop.class, (JsonSerializer) new StopSerializer());
        return module;
    }

    public void serialize(final Stop value, final JsonGenerator gen, final SerializerProvider serializers) throws IOException {
        gen.writeStartArray();
        gen.writeNumber(value.getPosition());
        gen.writeString(value.getColor().toString());
        gen.writeEndArray();
    }
}
