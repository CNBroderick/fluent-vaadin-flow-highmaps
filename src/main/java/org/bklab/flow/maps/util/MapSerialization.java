package org.bklab.flow.maps.util;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.PropertyAccessor;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectWriter;
import com.fasterxml.jackson.databind.ser.BeanSerializerModifier;
import org.bklab.flow.maps.model.AbstractConfigurationObject;
import org.bklab.flow.maps.model.serializers.*;

import java.io.Serializable;

public class MapSerialization implements Serializable {
    private static ObjectWriter jsonWriter;

    static {
        MapSerialization.jsonWriter = createObjectMapper().writer();
    }

    public static ObjectMapper createObjectMapper() {
        return createObjectMapper(new DefaultBeanSerializerModifier());
    }

    public static ObjectMapper createObjectMapper(final BeanSerializerModifier modifier) {
        final ObjectMapper mapper = new ObjectMapper().setSerializationInclusion(JsonInclude.Include.NON_NULL).setVisibility(PropertyAccessor.ALL, JsonAutoDetect.Visibility.NONE).setVisibility(PropertyAccessor.FIELD, JsonAutoDetect.Visibility.ANY).registerModule(MapEnumSerializer.getModule()).registerModule(StopSerializer.getModule()).registerModule(SolidColorSerializer.getModule()).registerModule(AxisListSerializer.getModule());
        return mapper.setSerializerFactory(mapper.getSerializerFactory().withSerializerModifier(modifier));
    }

    public static void setObjectWriter(final ObjectWriter newObjectWriter) {
        MapSerialization.jsonWriter = newObjectWriter;
    }

    public static String toJSON(final AbstractConfigurationObject object) {
        try {
            return MapSerialization.jsonWriter.writeValueAsString(object);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
            throw new RuntimeException("Error while serializing " + object.getClass().getSimpleName(), e);
        }
    }
}
