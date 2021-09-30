package org.bklab.flow.maps.model.serializers;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.SerializerProvider;

import java.io.IOException;

public abstract class BeanSerializationDelegate<T> {
    public abstract Class<T> getBeanClass();

    public abstract void serialize(final T p0, final BeanSerializerDelegator<T> p1, final JsonGenerator p2, final SerializerProvider p3) throws IOException;
}
