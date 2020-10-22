package factory.simplefactory.method;

import factory.entity.DellMounse;
import factory.entity.HpMouse;
import factory.interfaces.IMouse;

public class MouseFactory {
    public IMouse createHpMouse() {
        return new HpMouse();
    }

    public IMouse createDellMouse(){
        return new DellMounse();
    }
}
