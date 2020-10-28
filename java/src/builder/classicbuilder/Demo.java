package builder.classicbuilder;

public class Demo {
    public static void main(String[] args) {
        Director director = new Director();
        Builder builder = new DellBuilder();
        director.build(builder);
        Computer computer = builder.getComputer();
        System.out.println(computer.toString());
    }
}
