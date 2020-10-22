package factory.abstractfactory;

import factory.entity.DellKeyboard;
import factory.entity.DellMounse;
import factory.interfaces.IKeyboard;
import factory.interfaces.IMouse;

public class DellFactory implements Factory {
    @Override
    public IMouse createMouse() {
        return new DellMounse();
    }

    @Override
    public IKeyboard createKeyboard() {
        return new DellKeyboard();
    }
}
