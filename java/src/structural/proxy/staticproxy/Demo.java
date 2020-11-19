package structural.proxy.staticproxy;

public class Demo {
    public static void main(String[] args) {
        ProxyFactory.getProxy().submit("工资流水在次");
        ProxyFactory.getProxy().defend();
    }
}
