package builder.simplebuilder;

public class Computer {
    //必填
    private String cpu;
    private String ram;
    private String motherboards;
    //非必填
    private String mouse;
    private String keyboard;

    public Computer(Builder builder) {
        this.cpu = builder.cpu;
        this.ram = builder.ram;
        this.motherboards = builder.motherboards;
        this.mouse = builder.mouse;
        this.keyboard = builder.keyboard;
    }

    public static class Builder{
        //必填
        private String cpu;
        private String ram;
        private String motherboards;
        //非必填
        private String mouse;
        private String keyboard;

        public Computer builder() {
            return new Computer(this);
        }

        public Builder setCpu(String cpu) {
            this.cpu = cpu;
            return this;
        }

        public Builder setRam(String ram) {
            this.ram = ram;
            return this;
        }

        public Builder setMotherboards(String motherboards) {
            this.motherboards = motherboards;
            return this;
        }

        public Builder setMouse(String mouse) {
            this.mouse = mouse;
            return this;
        }

        public Builder setKeyboard(String keyboard) {
            this.keyboard = keyboard;
            return this;
        }
    }

    @Override
    public String toString() {
        return "Computer{" +
                "cpu='" + cpu + '\'' +
                ", ram='" + ram + '\'' +
                ", motherboards='" + motherboards + '\'' +
                ", mouse='" + mouse + '\'' +
                ", keyboard='" + keyboard + '\'' +
                '}';
    }
}
