package org.bklab.flow.maps.model.serializers;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.Module;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.module.SimpleModule;
import org.bklab.flow.maps.model.MapEnum;

import java.io.IOException;

public class MapEnumSerializer extends JsonSerializer<MapEnum> {
    public static Module getModule() {
        final SimpleModule module = new SimpleModule();
        module.addSerializer((Class) MapEnum.class, (JsonSerializer) new MapEnumSerializer());
        return module;
    }

    public void serialize(final MapEnum value, final JsonGenerator gen, final SerializerProvider serializers) throws IOException {
        gen.writeString(value.toString());
    }
}
