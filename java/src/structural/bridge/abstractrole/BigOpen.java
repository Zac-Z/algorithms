package structural.bridge.abstractrole;

import structural.bridge.implementor.Colour;

/**
 * 扩展抽象化角色
 */
public class BigOpen extends Pen {

    public BigOpen(Colour colour) {
        super(colour);
    }

    //业务代码
    @Override
    public void write() {
        //调用实现类的方法
        System.out.print("大号钢笔上");
        colour.operationImpl();
        System.out.println("绘图");
    }
}
