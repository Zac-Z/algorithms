package structural.adapter.bidirectional;

public class BidirectionalAdapter implements Target,Adaptee {
    private Target target;
    private Adaptee adaptee;

    public BidirectionalAdapter(Target target, Adaptee adaptee) {
        this.target = target;
        this.adaptee = adaptee;
    }

    @Override
    public void specificRequest() {
        target.request();
    }

    @Override
    public void request() {
        adaptee.specificRequest();
    }
}
