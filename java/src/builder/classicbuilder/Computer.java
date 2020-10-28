package builder.classicbuilder;

public class Computer {
    //必填
    private String cpu;
    private String ram;
    private String motherboards;
    //非必填
    private String mouse;
    private String keyboard;

    public String getCpu() {
        return cpu;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    public String getRam() {
        return ram;
    }

    public void setRam(String ram) {
        this.ram = ram;
    }

    public String getMotherboards() {
        return motherboards;
    }

    public void setMotherboards(String motherboards) {
        this.motherboards = motherboards;
    }

    public String getMouse() {
        return mouse;
    }

    public void setMouse(String mouse) {
        this.mouse = mouse;
    }

    public String getKeyboard() {
        return keyboard;
    }

    public void setKeyboard(String keyboard) {
        this.keyboard = keyboard;
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
