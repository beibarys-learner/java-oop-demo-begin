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
}
