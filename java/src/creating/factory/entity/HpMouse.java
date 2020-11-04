package creating.factory.entity;

import creating.factory.interfaces.IMouse;

public class HpMouse implements IMouse{
    @Override
    public String getMouse() {
        return "惠普品牌鼠标";
    }
}
