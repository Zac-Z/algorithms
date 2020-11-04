package creating.factory.simplefactory.method;

import creating.factory.entity.DellMounse;
import creating.factory.entity.HpMouse;
import creating.factory.interfaces.IMouse;

public class MouseFactory {
    public IMouse createHpMouse() {
        return new HpMouse();
    }

    public IMouse createDellMouse(){
        return new DellMounse();
    }
}
