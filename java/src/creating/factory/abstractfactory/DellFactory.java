package creating.factory.abstractfactory;

import creating.factory.entity.DellKeyboard;
import creating.factory.entity.DellMounse;
import creating.factory.interfaces.IKeyboard;
import creating.factory.interfaces.IMouse;

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
