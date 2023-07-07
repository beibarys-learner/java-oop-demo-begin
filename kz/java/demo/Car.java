package kz.java.demo;

public class Car {
    private String name;
    private String model;
    private String color;
    private int number;
    private int number1;
    // new variable number 2, modified number 1
    private int number2;

 /*   public Car(int number1) {
        this.number1 = number1;
    }*/
    // "constructor already exists" when try to add constructor with number 2

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
    // created 2 constructors with String and Int
    public Car(String name, int number) {
        this.name = name;
        this.number = number;
    }

    public Car(int number, String name) {
        this.name = name;
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

    public int sumNumbers(){
        return number1 + number2;
    }

    public int getNumber1() {
        return number1;
    }

    public void setNumber1(int number1) {
        this.number1 = number1;
    }

    public int getNumber2() {
        return number2;
    }

    public void setNumber2(int number2) {
        this.number2 = number2;
    }
}
