package creating.factory.entity;

import creating.factory.interfaces.IKeyboard;

public class DellKeyboard implements IKeyboard {
    @Override
    public String getKeyboard() {
        return "戴尔品牌键盘";
    }
}
