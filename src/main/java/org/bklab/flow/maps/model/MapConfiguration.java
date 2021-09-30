package org.bklab.flow.maps.model;

import java.io.Serializable;

public interface MapConfiguration extends Serializable {
    void fireAxesRescaled(final Axis p0, final Number p1, final Number p2, final boolean p3, final boolean p4);
}
