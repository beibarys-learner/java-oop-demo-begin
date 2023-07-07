package kz.java.demo;

import kz.java.demo.car.BMW;
import kz.java.demo.motorbike.Kawasaki;
import kz.java.demo.motorbike.Ural;

public class Main {
    public static void main(String[] args) {
        Kawasaki kawasaki = new Kawasaki("kawa", "super model", "white", 5.5, 2023);
        kawasaki.jump();

        Ural ural = new Ural("ural", "new model", "red", 5.7, true);
        ural.showInfo();
    }
}
