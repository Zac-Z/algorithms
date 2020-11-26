package structural.bridge.abstractrole;

import structural.bridge.implementor.Colour;

/**
 * 抽象化角色
 */
public abstract class Pen {
    //定义实现类接口对象
    protected Colour colour;

    public Pen(Colour colour) {
        this.colour = colour;
    }

    //声明抽象业务方法
    public abstract void write();
}
