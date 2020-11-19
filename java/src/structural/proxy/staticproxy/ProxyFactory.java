package structural.proxy.staticproxy;

import structural.proxy.ILawSuit;

public class ProxyFactory {
    public static ILawSuit getProxy() {
        return new ProxyLawyer(new ZhangSan());
    }
}
