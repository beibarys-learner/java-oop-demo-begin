package kz.java.demo.robotmodel;

public interface IRobot extends ITechnic{
    // interface you can write only methods and constants
    // below methods
    void move();
    void stop();
    void flight();
    // you cannot write the fields in the Interface

    // field methods
    String getName();
    IWing getWing();

    void talk();
}
