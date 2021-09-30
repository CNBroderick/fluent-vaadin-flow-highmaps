package org.bklab.flow.maps.events;

import com.vaadin.flow.component.ComponentEvent;
import com.vaadin.flow.component.DomEvent;
import com.vaadin.flow.component.EventData;
import org.bklab.flow.maps.HighChatsMap;
import org.bklab.flow.maps.model.YAxis;

@DomEvent("yaxes-extremes-set")
public class YAxesExtremesSetEvent extends ComponentEvent<HighChatsMap> implements HasAxis<YAxis> {
    private final double minimum;
    private final double maximum;
    private final int axisIndex;

    public YAxesExtremesSetEvent(final HighChatsMap source, final boolean fromClient, @EventData("event.detail.originalEvent.min") final double min, @EventData("event.detail.originalEvent.max") final double max, @EventData("event.detail.axis.userOptions.axisIndex") final int axisIndex) {
        super(source, fromClient);
        this.minimum = min;
        this.maximum = max;
        this.axisIndex = axisIndex;
    }

    public double getMinimum() {
        return this.minimum;
    }

    public double getMaximum() {
        return this.maximum;
    }

    public int getAxisIndex() {
        return this.axisIndex;
    }

    public YAxis getAxis() {
        return this.getSource().getConfiguration().getyAxis(this.axisIndex);
    }
}
