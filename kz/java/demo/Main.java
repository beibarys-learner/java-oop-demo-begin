package kz.java.demo;

import kz.java.demo.car.BMW;
import kz.java.demo.car.Car;
import kz.java.demo.car.Toyota;
import kz.java.demo.motorbike.Kawasaki;
import kz.java.demo.motorbike.Ural;

public class Main {
    public static void main(String[] args) {
//        final used for constants (public)
//        wheelCount created in Motorbike and Car
//        uncommented drive method in car, and fixed some methods in BMW, Toyota and Car

        Car car = new Car(new Engine(10));
        System.out.println("car.wheelCount = " + car.wheelCount);
        car.drive();

      /*  Ural ural = new Ural();
        System.out.println(ural.wheelCount);
*/
    }
}
