package structural.adapter.defaultadapter;

/**
 * 缺省适配器模式(Default Adapter Pattern)
 * 又称: 单接口适配器模式
 * 定义:
 *  当不需要实现一个接口所提供的所有方法时，可先设计一个抽象类实现该接口，并为接口中每个方法提供一个默认实现（空方法），
 *  那么该抽象类的子类可以选择性地覆盖父类的某些方法来实现需求，它适用于不想使用一个接口中的所有方法的情况。
 */
public class Demo {
    public static void main(String[] args) {
        ISerrvice serrvice = new ConcreteService();
        serrvice.serviceMethod1();
        serrvice.serviceMethod2();
        serrvice.serviceMethod3();
    }
}
