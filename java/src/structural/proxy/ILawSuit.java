package structural.proxy;

/**
 * 诉讼接口
 */
public interface ILawSuit {
    //提起诉讼
    void submit(String proof);

    //法庭辩护
    void defend();
}
