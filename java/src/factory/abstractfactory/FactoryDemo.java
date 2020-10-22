package factory.abstractfactory;

public class FactoryDemo {

    public static void main(String[] args) {
        Factory dellFactory = new DellFactory();
        System.out.println(dellFactory.createMouse().getMouse());
        System.out.println(dellFactory.createKeyboard().getKeyboard());

        System.out.println("***************************");

        Factory hpFactory = new HpFactory();
        System.out.println(hpFactory.createMouse().getMouse());
        System.out.println(hpFactory.createKeyboard().getKeyboard());
    }
}
