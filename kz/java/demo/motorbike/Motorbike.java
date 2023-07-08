package kz.java.demo.motorbike;

import kz.java.demo.Transport;

public class Motorbike extends Transport {
/*    public Motorbike() {
    }

    public Motorbike(String name, String model, String color, double volume) {
        super(name, model, color);
        this.volume = volume;
    }

    public Motorbike(String name, String model, String color) {
        super(name, model, color);
    }*/

    private double volume;
    public final int wheelCount;

    // added new constructor to initialize wheelCount in Main

    public Motorbike(String name, String model, String color, int wheelCount) {
        super(name, model, color);
        this.wheelCount = wheelCount; // can be given in main class
    }

    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }
}
