package kz.java.demo.carmodel;

public class Engine {
    private double Volume;

    //created constructor for Engine with Volume parameter and without parameter

    public Engine() {
    }

    public Engine(double volume) {
        Volume = volume;
    }

    public double getVolume() {
        return Volume;
    }

    public void setVolume(double volume) {
        Volume = volume;
    }
}
