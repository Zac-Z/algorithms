package structural.adapter;

import structural.adapter.bidirectional.BidirectionalAdapter;
import structural.adapter.bidirectional.ConcreteAdaptee;
import structural.adapter.bidirectional.ConcreteTarget;
import structural.adapter.bidirectional.Target;
import structural.adapter.unidirectional.Adaptee;
import structural.adapter.unidirectional.ClassAdaptor;
import structural.adapter.unidirectional.ITarget;
import structural.adapter.unidirectional.ObjectAdaptor;

/**
 * 适配器模式
 *
 * 类型:
 *  类适配器: 对象适配器使用组合关系来实现,即适配器与适配者之间是关联关系
 *  对象适配器: 类适配器使用继承关系来实现,适配器与适配者之间是继承（或实现）关系
 *  缺省适配器模式(Default Adapter Pattern)：当不需要实现一个接口所提供的所有方法时，可先设计一个抽象类实现该接口，并为接口中
 *      每个方法提供一个默认实现（空方法），那么该抽象类的子类可以选择性地覆盖父类的某些方法来实现需求，它适用于不想使用一个接口
 *      中的所有方法的情况，又称为单接口适配器模式。
 *
 * 构成
 *  Target（目标抽象类）：目标抽象类定义客户所需接口，可以是一个抽象类或接口，也可以是具体类。
 *  Adapter（适配器类）：适配器可以调用另一个接口，作为一个转换器，对Adaptee和Target进行适配，
 *      适配器类是适配器模式的核心，在对象适配器中，它通过继承Target并关联一个Adaptee对象使二者<br>产生联系。
 *  Adaptee（适配者类）：适配者即被适配的角色，它定义了一个已经存在的接口，这个接口需要适配，
 *      适配者类一般是一个具体类，包含了客户希望使用的业务方法，在某些情况下可能没有适配者类的<br>源代码。
 *
 *
 */
public class Demo {
    public static void main(String[] args) {
        ITarget classAdaptor,objectAdaptor;

        //类适配器
        classAdaptor = new ClassAdaptor();
        classAdaptor.f1();
        classAdaptor.f2();
        //对象适配器
        objectAdaptor = new ObjectAdaptor(new Adaptee());
        objectAdaptor.f1();
        objectAdaptor.f2();
        objectAdaptor.fc();

        //双向适配器
        Target target = new BidirectionalAdapter(new ConcreteTarget(),new ConcreteAdaptee());
        structural.adapter.bidirectional.Adaptee adaptee = new BidirectionalAdapter(new ConcreteTarget(),new ConcreteAdaptee());
        target.request();
        adaptee.specificRequest();
    }
}
