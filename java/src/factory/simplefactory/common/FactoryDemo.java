package factory.simplefactory.common;

import factory.interfaces.IMouse;
import factory.simplefactory.common.MouseFactory;

public class FactoryDemo {
    public static void main(String[] args) {
        MouseFactory factory = new MouseFactory();
        IMouse hpMouse = factory.createMouse("hp");
        IMouse dellMouse = factory.createMouse("dell");
        System.out.println(hpMouse.getMouse());
        System.out.println(dellMouse.getMouse());
    }
}
