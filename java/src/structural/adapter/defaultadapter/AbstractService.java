package structural.adapter.defaultadapter;

public abstract class AbstractService implements ISerrvice {
    @Override
    public void serviceMethod1() {
        System.out.println("缺省实配器,功能1");
    }

    @Override
    public void serviceMethod2() {
        System.out.println("缺省实配器,功能2");
    }

    @Override
    public void serviceMethod3() {
        System.out.println("缺省实配器,功能3");
    }
}
