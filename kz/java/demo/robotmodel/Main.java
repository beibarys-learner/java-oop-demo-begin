package kz.java.demo.robotmodel;

public class Main {
    public static void main(String[] args) {

        AircraftWing aircraftWing = new AircraftWing();
        aircraftWing.setSize(200);
        aircraftWing.open();

        Robocop robocop = new Robocop("Robo Цыпа");
        robocop.setWing(aircraftWing);

        robocop.flight();
        robocop.talk();

        // constructors created in ARobot, Robocop, Terminator
        // inheritance is not preferred in abstract classes
        // added Wing interface, getWing in IRobot (row 14)
        // created AircraftWing
    }
}
