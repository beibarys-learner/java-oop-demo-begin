package kz.java.demo.robotmodel;

public abstract class ARobot implements IRobot{
    private String name;
    private Wing wing;

    public ARobot(String name, Wing wing) {
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
    public Wing getWing() {
        return wing;
    }

    public void setWing(Wing wing) {
        this.wing = wing;
    }
}
