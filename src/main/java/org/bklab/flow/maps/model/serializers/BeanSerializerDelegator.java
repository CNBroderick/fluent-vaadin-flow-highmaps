package org.bklab.flow.maps.model.serializers;

import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.ser.impl.BeanAsArraySerializer;
import com.fasterxml.jackson.databind.ser.impl.ObjectIdWriter;
import com.fasterxml.jackson.databind.ser.std.BeanSerializerBase;

import java.io.IOException;
import java.util.Set;

public class BeanSerializerDelegator<T> extends BeanSerializerBase {
    private BeanSerializationDelegate<T> delegate;

    public BeanSerializerDelegator(final BeanSerializerBase source) {
        super(source);
    }

    public BeanSerializerDelegator(final BeanSerializerBase source, final ObjectIdWriter objectIdWriter) {
        super(source, objectIdWriter);
    }

    public BeanSerializerDelegator(final BeanSerializerBase source, final String[] toIgnore) {
        super(source, toIgnore);
    }

    public BeanSerializerDelegator(final BeanSerializerBase source, final Object filterId) {
        super(source, null, filterId);
    }

    public BeanSerializerDelegator(final BeanSerializerBase source, final BeanSerializationDelegate<T> delegate) {
        super(source);
        this.delegate = delegate;
    }

    public BeanSerializerBase withObjectIdWriter(final ObjectIdWriter objectIdWriter) {
        return new BeanSerializerDelegator<Object>(this, objectIdWriter);
    }

    protected BeanSerializerBase withIgnorals(final Set<String> toIgnore) {
        return new BeanSerializerDelegator<Object>(this, toIgnore);
    }

    public BeanSerializerBase withFilterId(final Object filterId) {
        return new BeanSerializerDelegator<Object>(this, filterId);
    }

    protected BeanSerializerBase asArraySerializer() {
        if (this._objectIdWriter == null && this._anyGetterWriter == null && this._propertyFilterId == null) {
            return new BeanAsArraySerializer(this);
        }
        return this;
    }

    public void serialize(final Object bean, final JsonGenerator jgen, final SerializerProvider provider) throws IOException {
        this.delegate.serialize(this.delegate.getBeanClass().cast(bean), this, jgen, provider);
    }

    public void serializeFields(final Object bean, final JsonGenerator jgen, final SerializerProvider provider) throws IOException {
        super.serializeFields(bean, jgen, provider);
    }
}
