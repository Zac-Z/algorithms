package structural.proxy.staticproxy;

import structural.proxy.ILawSuit;

/**
 * 被代理类
 */
public class ZhangSan implements ILawSuit {
    @Override
    public void submit(String proof) {
        System.out.println(String.format("老板欠薪跑路,证据如下: %s",proof));
    }

    @Override
    public void defend() {
        System.out.println(String.format("铁证如山,%s还钱","李二"));
    }
}
