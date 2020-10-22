package factory.simplefactory.common;

import factory.entity.DellMounse;
import factory.entity.HpMouse;
import factory.interfaces.IMouse;

public class MouseFactory {

    public IMouse createMouse(String brand) {
        if (null == brand || brand.isEmpty()) {
            return null;
        }
        IMouse mouse = null;
        switch (brand) {
            case "dell":
                mouse = new DellMounse();
                break;
            case "hp":
                mouse = new HpMouse();
                break;
            default:
                System.out.println("无品牌记录");
                break;
        }
        return mouse;
    }
}
