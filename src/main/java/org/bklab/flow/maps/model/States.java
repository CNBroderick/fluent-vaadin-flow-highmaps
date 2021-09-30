package org.bklab.flow.maps.model;

import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

@Getter
@Setter
@Accessors(chain = true)
public class States extends AbstractConfigurationObject {
    private Hover hover;
    private Normal normal;
    private Select select;

    public Hover getHover() {
        if (this.hover == null) {
            this.hover = new Hover();
        }
        return this.hover;
    }

    public Normal getNormal() {
        if (this.normal == null) {
            this.normal = new Normal();
        }
        return this.normal;
    }

    public Select getSelect() {
        if (this.select == null) {
            this.select = new Select();
        }
        return this.select;
    }
}
