package creating.builder.simplebuilder;

public class ComputerBuilderDemo {
    public static void main(String[] args) {
        Computer computer = new Computer.Builder()
                .setCpu("因特尔")
                .setRam("海力士")
                .setMotherboards("华硕")
                .setMouse("技嘉")
                .setKeyboard("樱桃")
                .builder();
        System.out.println(computer.toString());
    }
}
