package factory.factorymethod;

import factory.entity.HpMouse;
import factory.interfaces.Factory;
import factory.interfaces.IMouse;

public class HpMouseFactory implements Factory {
    @Override
    public IMouse createMouse() {
        return new HpMouse();
    }
}
