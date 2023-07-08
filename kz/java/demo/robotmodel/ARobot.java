package kz.java.demo.robotmodel;

public abstract class ARobot implements IRobot{
    private String name;
    private IWing wing;

    public ARobot(String name, IWing wing) {
        this.name = name;
        this.wing = wing;
    }

    public ARobot() {
    }

    @Override
    public String getName() {
        return name;
    }
    //  no need to declare override in Setter, since no setter in the Intercase
    public void setName(String name) {
        this.name = name;
    }

    //System.out.println(name + " talking");
    // you can create abstract methods

    @Override
    public IWing getWing() {
        return wing;
    }

    public void setWing(IWing wing) {
        this.wing = wing;
    }

    @Override
    public void on() {
        System.out.println("on");
    }

    @Override
    public void off() {
        System.out.println("off");
    }
}
