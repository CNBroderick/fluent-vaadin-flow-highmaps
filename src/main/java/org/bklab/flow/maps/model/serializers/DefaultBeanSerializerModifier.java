package org.bklab.flow.maps.model.serializers;

import com.fasterxml.jackson.databind.BeanDescription;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializationConfig;
import com.fasterxml.jackson.databind.ser.BeanSerializerModifier;
import com.fasterxml.jackson.databind.ser.std.BeanSerializerBase;
import org.bklab.flow.maps.model.AbstractSeries;
import org.bklab.flow.maps.model.AxisTitle;
import org.bklab.flow.maps.model.LegendTitle;
import org.bklab.flow.maps.model.Title;

public class DefaultBeanSerializerModifier extends BeanSerializerModifier {
    public JsonSerializer<?> modifySerializer(final SerializationConfig config, final BeanDescription beanDesc, final JsonSerializer<?> serializer) {
        if (Title.class.isAssignableFrom(beanDesc.getBeanClass())) {
            return (JsonSerializer<?>) new BeanSerializerDelegator((BeanSerializerBase) serializer, new TitleBeanSerializer());
        }
        if (AxisTitle.class.isAssignableFrom(beanDesc.getBeanClass())) {
            return (JsonSerializer<?>) new BeanSerializerDelegator((BeanSerializerBase) serializer, new AxisTitleBeanSerializer());
        }
        if (LegendTitle.class.isAssignableFrom(beanDesc.getBeanClass())) {
            return (JsonSerializer<?>) new BeanSerializerDelegator((BeanSerializerBase) serializer, new LegendTitleBeanSerializer());
        }
        if (AbstractSeries.class.isAssignableFrom(beanDesc.getBeanClass())) {
            return (JsonSerializer<?>) new BeanSerializerDelegator((BeanSerializerBase) serializer, new AbstractSeriesBeanSerializer());
        }
        return super.modifySerializer(config, beanDesc, serializer);
    }
}
