package creating.factory.abstractfactory;

import creating.factory.entity.HpKeyboard;
import creating.factory.entity.HpMouse;
import creating.factory.interfaces.IKeyboard;
import creating.factory.interfaces.IMouse;

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
