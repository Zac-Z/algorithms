package structural.bridge.abstractrole;

import structural.bridge.implementor.Colour;

/**
 * 扩展抽象化角色
 */
public class StandardPen extends Pen {
    public StandardPen(Colour colour) {
        super(colour);
    }

    @Override
    public void write() {
        //调用实现类的方法
        System.out.print("标准号钢笔上");
        colour.operationImpl();
        System.out.println("绘图");
    }
}
