package kz.java.demo;

import kz.java.demo.car.BMW;
import kz.java.demo.car.Car;
import kz.java.demo.car.Toyota;
import kz.java.demo.motorbike.Kawasaki;
import kz.java.demo.motorbike.Ural;

public class Main {
    public static void main(String[] args) {
        //added final static int year in Transport class
        Toyota toyota = new Toyota();
        System.out.println(toyota.year);

        Car car = new Car();
        System.out.println(car.year);
        //same value for different objects, add some method to stop() you can call it

    }
}
