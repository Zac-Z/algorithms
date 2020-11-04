package creating.factory.entity;

import creating.factory.interfaces.IMouse;

public class DellMounse implements IMouse{
    @Override
    public String getMouse() {
        return "戴尔品牌鼠标";
    }
}
