package kz.java.demo.carmodel;

import kz.java.demo.carmodel.car.Car;
import kz.java.demo.carmodel.car.Toyota;

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
