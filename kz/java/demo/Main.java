package kz.java.demo;

public class Main {
    public static void main(String[] args) {
        Car car = new Car();

        Car nissan = new Car();
        nissan.setName("GTR");
        nissan.setColor("Black");
        nissan.setModel("Sport Car");

        System.out.println(nissan.getName());
        System.out.println(nissan.getColor());
        System.out.println(nissan.getModel());

        nissan.drive();

        Car bmw = new Car();


    }
}
