package kz.java.demo;

public class Car extends Transport{
    private int number; // car can have own number so Car class also has get, set methods

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public void signal(){
        System.out.println("signal");
    }

    @Override
    public void drive() {
        System.out.println("car can drive - overrided");
    }

    @Override
    public void stop() {
        System.out.println("car can stop - overrided");
    }

    //you should write override, because it will help to find the methods from superclass
}
