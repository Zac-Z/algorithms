package factory.abstractfactory;

import factory.interfaces.IKeyboard;
import factory.interfaces.IMouse;

public interface Factory {
    public IMouse createMouse();

    public IKeyboard createKeyboard();
}
