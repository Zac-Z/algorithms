package builder.classicbuilder;

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
