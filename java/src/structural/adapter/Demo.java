package structural.adapter;

/**
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
    }
}
