package factory.factorymethod;

import factory.entity.DellMounse;
import factory.interfaces.Factory;
import factory.interfaces.IMouse;

public class DellMouseFactory implements Factory{
    @Override
    public IMouse createMouse() {
        return new DellMounse();
    }
}
