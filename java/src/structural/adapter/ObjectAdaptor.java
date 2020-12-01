package structural.adapter;

/**
 * 对象适配器: 基于继承
 */
public class ObjectAdaptor implements ITarget{
    //维持一个对适配者对象的引用

    private Adaptee adaptee;

    public ObjectAdaptor(Adaptee adaptee) {
        this.adaptee = adaptee;
    }

    @Override
    public void f1() {
        //委托给Adaptee
        System.out.print("对象适配 适配fa: ");
        adaptee.fa();
    }

    @Override
    public void f2() {
        //委托给Adaptee
        System.out.print("对象适配 适配fb: ");
        adaptee.fb();
    }

    @Override
    public void fc() {
        adaptee.fc();
    }
}
