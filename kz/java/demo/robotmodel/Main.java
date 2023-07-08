package kz.java.demo.robotmodel;

public class Main {
    public static void main(String[] args) {

        AircraftWing aircraftWing = new AircraftWing();
        aircraftWing.setSize(200);
        aircraftWing.open();

        Robocop robocop = new Robocop();
        robocop.setName("Biba");
        robocop.setWing(aircraftWing);

        robocop.flight();
        robocop.talk();

        // IRobot no more extends from Itechnic, ARobot implements IRobot, ITechnic

    }
}
