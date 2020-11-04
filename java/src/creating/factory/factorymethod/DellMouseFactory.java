package creating.factory.factorymethod;

import creating.factory.entity.DellMounse;
import creating.factory.interfaces.Factory;
import creating.factory.interfaces.IMouse;

public class DellMouseFactory implements Factory{
    @Override
    public IMouse createMouse() {
        return new DellMounse();
    }
}
