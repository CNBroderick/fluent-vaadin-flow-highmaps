package org.bklab.flow.maps.model;

import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@Accessors(chain = true)
public class AxisList<T extends Axis> extends AbstractConfigurationObject {
    private final List<T> axesList;

    public AxisList() {
        this.axesList = new ArrayList<T>();
    }

    public int getNumberOfAxes() {
        return this.axesList.size();
    }

    public T getAxis(final int index) {
        return this.axesList.get(index);
    }

    public List<T> getAxes() {
        return this.axesList;
    }

    public AxisList<T> addAxis(final T axis) {
        this.axesList.add(axis);
        return this.updateIndexes();
    }

    private AxisList<T> updateIndexes() {
        for (int i = 0; i < this.axesList.size(); ++i) {
            final Axis axis = this.axesList.get(i);
            axis.setAxisIndex(i);
        }
        return this;
    }

    public AxisList<T> removeAxis(final T axis) {
        this.axesList.remove(axis);
        return this.updateIndexes();
    }

    public int indexOf(final Axis axis) {
        return this.axesList.indexOf(axis);
    }

    public boolean contains(final Axis axis) {
        return this.axesList.contains(axis);
    }
}
