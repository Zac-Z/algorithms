package structural.adapter;

/**
 * 类适配器: 基于继承
 */
public class ClassAdaptor extends Adaptee implements ITarget {
    @Override
    public void f1() {
        System.out.print("类适配 适配fa: ");
        super.fa();
    }

    @Override
    public void f2() {
        System.out.print("类适配 适配fb: ");
        super.fb();
    }
}
