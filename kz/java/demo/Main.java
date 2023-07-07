package kz.java.demo;

public class Main {
    public static void main(String[] args) {

        Car car1 = new Car("a", "b", "c");
        // a b c values are derived to Transport
        // a b c and 10 goes to Car, not Transport
        Car car3 = new Car("a", "b", "c", 10);
        Car car = new Car( 10);

        System.out.println("car.getName() = " + car.getName());
        System.out.println("car.getColor() = " + car.getColor());
        System.out.println("car.getModel() = " + car.getModel());
        System.out.println("car.getNumber() = " + car.getNumber());

        //Car class inherits all methods and fields from parent class Transport, and has access to them
     /*   car.setName("car");
        car.drive();*/

//        transport.signal(); // if you uncomment it, notice that transport object doesn't have unique fields and methods of car

    }
}
