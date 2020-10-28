package builder.classicbuilder;

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
