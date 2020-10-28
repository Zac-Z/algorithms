package builder.classicbuilder;

public class Demo {
    public static void main(String[] args) {
        Director director = new Director();
        Builder builder = new DellBuilder();

        Computer computer = director.build(builder);
        System.out.println(computer.toString());
    }
}
