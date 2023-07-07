package kz.java.demo;

public class Car {
    String name;
    String model;
    String color;
    
    public void drive(){
        String hello = "hello";
        System.out.println(hello + name);
        System.out.println(name + " can drive");
    }
    public void stop(){
        System.out.println(name + " must stop");
    }

}
