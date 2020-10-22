package factory.abstractfactory;

import factory.entity.HpKeyboard;
import factory.entity.HpMouse;
import factory.interfaces.IKeyboard;
import factory.interfaces.IMouse;

public class HpFactory implements Factory {
    @Override
    public IMouse createMouse() {
        return new HpMouse();
    }

    @Override
    public IKeyboard createKeyboard() {
        return new HpKeyboard();
    }
}
