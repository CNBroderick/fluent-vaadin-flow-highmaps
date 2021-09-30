package org.bklab.flow.maps.util;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.PropertyAccessor;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectWriter;
import com.fasterxml.jackson.databind.ser.BeanSerializerModifier;
import org.bklab.flow.maps.model.AbstractConfigurationObject;
import org.bklab.flow.maps.model.serializers.AxisListSerializer;
import org.bklab.flow.maps.model.serializers.DefaultBeanSerializerModifier;
import org.bklab.flow.maps.model.serializers.SolidColorSerializer;
import org.bklab.flow.maps.model.serializers.StopSerializer;

import java.io.Serializable;

public class ChartSerialization implements Serializable {
    static final ObjectWriter jsonWriterChartOptions;
    private static ObjectWriter jsonWriter;

    static {
        final ObjectMapper defaultMapper = createObjectMapper();
        jsonWriterChartOptions = defaultMapper.setSerializerFactory(defaultMapper.getSerializerFactory()).writer();
        ChartSerialization.jsonWriter = createObjectMapper().writer();
    }

    public static ObjectMapper createObjectMapper() {
        return createObjectMapper(new DefaultBeanSerializerModifier());
    }

    public static ObjectMapper createObjectMapper(final BeanSerializerModifier modifier) {
        final ObjectMapper mapper = new ObjectMapper().setSerializationInclusion(JsonInclude.Include.NON_NULL).setVisibility(PropertyAccessor.ALL, JsonAutoDetect.Visibility.NONE).setVisibility(PropertyAccessor.FIELD, JsonAutoDetect.Visibility.ANY).registerModule(StopSerializer.getModule()).registerModule(SolidColorSerializer.getModule()).registerModule(AxisListSerializer.getModule());
        return mapper.setSerializerFactory(mapper.getSerializerFactory().withSerializerModifier(modifier));
    }

    public static void setObjectMapperInstance(final ObjectWriter newObjectWriter) {
        ChartSerialization.jsonWriter = newObjectWriter;
    }

    public static String toJSON(final AbstractConfigurationObject object) {
        try {
            return ChartSerialization.jsonWriter.writeValueAsString(object);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
            throw new RuntimeException("Error while serializing " + object.getClass().getSimpleName(), e);
        }
    }
}
