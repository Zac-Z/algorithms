package creating.factory.simplefactory.common;

import creating.factory.interfaces.IMouse;

public class FactoryDemo {
    public static void main(String[] args) {
        MouseFactory factory = new MouseFactory();
        IMouse hpMouse = factory.createMouse("hp");
        IMouse dellMouse = factory.createMouse("dell");
        System.out.println(hpMouse.getMouse());
        System.out.println(dellMouse.getMouse());
    }
}
