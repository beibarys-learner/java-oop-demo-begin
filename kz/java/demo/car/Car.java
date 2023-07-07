package kz.java.demo.car;

import kz.java.demo.Engine; // imported Engine
import kz.java.demo.Transport;

public class Car extends Transport {
    private int number; // car can have own number so Car class also has get, set methods
    private Engine engine; // added Engine to Car

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public void signal(){
        System.out.println("signal");
    }

/*    @Override
    public void drive() {

        // you can use parent method using super keyword, like hello car
        System.out.println("car can drive - overrided");
    }*/

    @Override
    public void stop() {
        System.out.println("car can stop - overrided");
    }
    // new constructor defined from Transport class
    public Car(String name, String model, String color) {
        super(name, model, color);
    }
    // created new constructor belongs to Car, with unique int
    public Car(String name, String model, String color, int number) {
        super(name, model, color);
        this.number = number;
    }

    public Car() {
    }
    // modified Car constructor by adding Engine
    public Car(int number, Engine engine) {
        this.number = number;
        this.engine = engine;
    }
}
