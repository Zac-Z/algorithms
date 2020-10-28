package builder.classicbuilder;

/**
 * 抽象建造者
 *
 * 它为创建一个产品对象的各个部件指定抽象接口，在该接口中一般声明两类方法:
 *   一类方法是setXXX()/builXXX()，它们用于创建复杂对象的各个部件；
 *   另一类方法是getXXX()，它们用于返回复杂对象。Builder既可以是抽象类，也可以是接口。
 */
public abstract class Builder {
    Computer computer = new Computer();
    
    public abstract void setCpu();
    public abstract void setRam();
    public abstract void setMotherboards();
    public abstract void setMouse();
    public abstract void setKeyboard();

    public Computer getComputer() {
        return computer;
    }
}
