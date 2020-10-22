package factory.entity;

import factory.interfaces.IMouse;

public class HpMouse implements IMouse{
    @Override
    public String getMouse() {
        return "惠普品牌鼠标";
    }
}
