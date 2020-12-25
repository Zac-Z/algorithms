package structural.adapter.defaultadapter;

public class ConcreteService extends AbstractService {
    @Override
    public void serviceMethod1() {
        System.out.println("缺省适配器功能1重新实现");
    }
}
