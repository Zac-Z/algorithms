package creating.factory.abstractfactory;

import creating.factory.interfaces.IKeyboard;
import creating.factory.interfaces.IMouse;

public interface Factory {
    public IMouse createMouse();

    public IKeyboard createKeyboard();
}
