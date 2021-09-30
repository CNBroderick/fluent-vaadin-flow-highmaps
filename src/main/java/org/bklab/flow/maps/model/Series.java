package org.bklab.flow.maps.model;

public interface Series<S extends Series<S>> {
    String getName();

    S setName(final String p0);

    S setConfiguration(final Configuration p0);

    AbstractPlotOptions getPlotOptions();

    S setPlotOptions(final AbstractPlotOptions p0);

    String getId();

    S setId(final String p0);
}
