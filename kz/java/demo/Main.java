package kz.java.demo;

public class Main {
    public static void main(String[] args) {
        Car car = new Car();
        Car bmw = new Car();
        Car nissan = new Car();

        System.out.println(car.model);
        bmw.drive();
        nissan.stop();


    }
}
