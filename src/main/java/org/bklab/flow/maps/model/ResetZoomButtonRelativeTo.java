package org.bklab.flow.maps.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.Accessors;

@Getter
@Accessors(chain = true)
public enum ResetZoomButtonRelativeTo implements MapEnum {
    PLOT("plot"),
    CHART("chart");

    private final String frame;

    ResetZoomButtonRelativeTo(final String frame) {
        this.frame = frame;
    }

    @Override
    public String toString() {
        return this.frame;
    }
}
