package structural.proxy.jdkproxy;

import structural.proxy.ILawSuit;

public class Demo {
    public static void main(String[] args) {
        ILawSuit proxy = (ILawSuit) ProxyFactory.getDynProxy(new WangWu());
        proxy.submit("手写千条在此");
        proxy.defend();
    }
}
