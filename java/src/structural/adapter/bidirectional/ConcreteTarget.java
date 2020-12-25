package structural.adapter.bidirectional;

public class ConcreteTarget implements Target{
    @Override
    public void request() {
        System.out.println("target请求");
    }
}
