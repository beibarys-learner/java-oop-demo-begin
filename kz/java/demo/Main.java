package kz.java.demo;

import kz.java.demo.car.BMW;
import kz.java.demo.car.Car;
import kz.java.demo.motorbike.Kawasaki;
import kz.java.demo.motorbike.Ural;

public class Main {
    public static void main(String[] args) {

        //created object engine and set volume 10
        Engine engine = new Engine();
        engine.setVolume(10);

        Car car = new Car();
        car.setEngine(engine); // imported engine into Car
    }
}
