package structural.proxy.staticproxy;

import structural.proxy.ILawSuit;

/**
 * 代理律师
 */
public class ProxyLawyer implements ILawSuit {

    //持有要代理的对象
    ILawSuit plaintiff;

    public ProxyLawyer(ILawSuit plaintiff) {
        this.plaintiff = plaintiff;
    }

    @Override
    public void submit(String proof) {
        System.out.println("诉讼全权交由律师处理");
        plaintiff.submit(proof);
    }

    @Override
    public void defend() {
        System.out.println("被告无法出庭,被告诉求由律师代为转达,如下:");
        plaintiff.defend();
    }
}
