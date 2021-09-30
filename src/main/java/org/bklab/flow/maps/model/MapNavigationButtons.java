package org.bklab.flow.maps.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.Accessors;

@Setter
@Accessors(chain = true)
@NoArgsConstructor
public class MapNavigationButtons extends AbstractConfigurationObject {
    private ZoomIn zoomIn;
    private ZoomOut zoomOut;

    public ZoomIn getZoomIn() {
        if (this.zoomIn == null) {
            this.zoomIn = new ZoomIn();
        }
        return this.zoomIn;
    }


    public ZoomOut getZoomOut() {
        if (this.zoomOut == null) {
            this.zoomOut = new ZoomOut();
        }
        return this.zoomOut;
    }

}
