package kz.java.demo;

import kz.java.demo.car.BMW;
import kz.java.demo.car.Car;
import kz.java.demo.motorbike.Kawasaki;
import kz.java.demo.motorbike.Ural;

public class Main {
    public static void main(String[] args) {

        //created object engine and set volume 10
        Engine engine = new Engine(10);
//        engine.setVolume(10);

        Car car = new Car(13, engine);
        System.out.println("car.getEngine() = " + car.getEngine());
    }
}
