package kz.java.demo;

import kz.java.demo.car.BMW;
import kz.java.demo.car.Car;
import kz.java.demo.car.Toyota;
import kz.java.demo.motorbike.Kawasaki;
import kz.java.demo.motorbike.Ural;

public class Main {
    public static void main(String[] args) {
        Toyota toyota = new Toyota();
        toyota.year = 2000; // year will be static for Transport and child class' objects

        // static optimizes code, you don't need get set methods
        System.out.println(toyota.year);
        System.out.println(toyota.formatText("some text"));
        toyota.formatText("bbbb");
        Car car = new Car();
        System.out.println(car.formatText("cccc"));
    }
}
