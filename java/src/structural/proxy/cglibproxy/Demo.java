package structural.proxy.cglibproxy;

import java.time.LocalTime;

public class Demo {
    public static void main(String[] args) {
        ZhaoSi cProxy= (ZhaoSi) ProxyFactory.getGcLibDynProxy(new ZhaoSi());
        cProxy.submit("工资流水在此");
        cProxy.defend();
    }
}
