package creating.factory.factorymethod;

import creating.factory.entity.HpMouse;
import creating.factory.interfaces.Factory;
import creating.factory.interfaces.IMouse;

public class HpMouseFactory implements Factory {
    @Override
    public IMouse createMouse() {
        return new HpMouse();
    }
}
