package kz.java.demo;

public class Main {
    public static void main(String[] args) {

        Car car = new Car();

        Car nissan = new Car();
        nissan.setName("GTR");
        nissan.setColor("Black");
        nissan.setModel("Sport Car");
        nissan.setNumber1(10);
        nissan.setNumber2(20);

        int result = nissan.sumNumbers();
        System.out.println("result = " + result);
    }
}
