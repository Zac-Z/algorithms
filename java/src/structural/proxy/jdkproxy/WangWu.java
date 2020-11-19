package structural.proxy.jdkproxy;

import structural.proxy.ILawSuit;

public class WangWu implements ILawSuit {
    @Override
    public void submit(String proof) {
        System.out.println(String.format("老板欠薪跑路,证据如下: %s",proof));
    }

    @Override
    public void defend() {
        System.out.println(String.format("铁证如山,%s应还王五工资5W","李二"));
    }
}
