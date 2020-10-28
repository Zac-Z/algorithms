package builder.classicbuilder;

public class Director {
    
    public void build(Builder builder) {
        builder.setCpu();
        builder.setRam();
        builder.setMotherboards();
        builder.setMouse();
        builder.setKeyboard();
    }
}
