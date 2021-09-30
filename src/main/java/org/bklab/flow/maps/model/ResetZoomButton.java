package org.bklab.flow.maps.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.Accessors;
import org.bklab.flow.maps.model.style.ButtonTheme;

@Getter
@Setter
@Accessors(chain = true)
@NoArgsConstructor
public class ResetZoomButton extends AbstractConfigurationObject {
    private Position position;
    private ResetZoomButtonRelativeTo relativeTo;
    private ButtonTheme theme;

    public Position getPosition() {
        if (this.position == null) {
            this.position = new Position();
        }
        return this.position;
    }

    public ButtonTheme getTheme() {
        if (this.theme == null) {
            this.theme = new ButtonTheme();
        }
        return this.theme;
    }

}
