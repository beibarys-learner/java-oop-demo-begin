package kz.java.demo.robotmodel;

public interface IRobot {
    // interface you can write only methods and constants
    // below methods
    default void move(){
        System.out.println("default move" + getName());
    };
    void stop();
    void flight();
    // you cannot write the fields in the Interface

    // field methods
    String getName();
    IWing getWing();

    void talk();
}
