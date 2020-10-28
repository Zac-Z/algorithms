package builder.classicbuilder;

/**
 * 具体建造者
 *
 * 它实现了Builder接口，实现各个部件的具体构造和装配方法，定义并明确它所创建的复杂对象，也可以提供一个方法返回创建好的复杂产品对象
 */
public class DellBuilder extends Builder {
    @Override
    public void setCpu() {
        computer.setCpu("因特尔");
    }

    @Override
    public void setRam() {
        computer.setRam("海力士");
    }

    @Override
    public void setMotherboards() {
        computer.setMotherboards("华硕");
    }

    @Override
    public void setMouse() {
        computer.setMouse("技嘉");
    }

    @Override
    public void setKeyboard() {
        computer.setKeyboard("樱桃");
    }
}
