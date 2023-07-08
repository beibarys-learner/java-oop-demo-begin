package kz.java.demo.robotmodel;

public abstract class ARobot implements IRobot{
    private String name;
    @Override
    public String getName() {
        return name;
    }
    //  no need to declare override in Setter, since no setter in the Intercase
    public void setName(String name) {
        this.name = name;
    }
}
