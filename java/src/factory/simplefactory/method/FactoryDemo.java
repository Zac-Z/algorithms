package factory.simplefactory.method;

import factory.interfaces.IMouse;

public class FactoryDemo {
    public static void main(String[] args) {
        MouseFactory factory = new MouseFactory();
        IMouse hpMouse = factory.createHpMouse();
        System.out.println(hpMouse.getMouse());
        IMouse dellMouse = factory.createDellMouse();
        System.out.println(dellMouse.getMouse());
    }
}
