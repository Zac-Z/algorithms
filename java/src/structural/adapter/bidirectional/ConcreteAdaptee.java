package structural.adapter.bidirectional;

public class ConcreteAdaptee implements Adaptee {
    @Override
    public void specificRequest() {
        System.out.println("adaptee 请求");
    }
}
