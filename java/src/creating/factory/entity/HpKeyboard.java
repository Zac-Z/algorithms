package creating.factory.entity;

import creating.factory.interfaces.IKeyboard;

public class HpKeyboard implements IKeyboard {
    @Override
    public String getKeyboard() {
        return "惠普品牌键盘";
    }
}
