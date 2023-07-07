package kz.java.demo;

public class Car {
    private String name;
    private String model;
    private String color;
    private int number;

    // we created two constructor: with parameters and without parameters
    public Car() {
    }

    public Car(String name) {
        this.name = name;
    }

    public Car(String name, String model, String color) {
        this.name = name;
        this.model = model;
        this.color = color;
    }
    // created new variable int, new constructor with 4 parameters
    public Car(String name, String model, String color, int number) {
        this.name = name;
        this.model = model;
        this.color = color;
        this.number = number;
    }

    public void drive(){
        String hello = "hello ";
        System.out.println("");
        System.out.println(hello + name);
        System.out.println(name + " can drive");
    }
    public void stop(){
        System.out.println(name + " must stop");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
