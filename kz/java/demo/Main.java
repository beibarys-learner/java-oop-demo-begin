package kz.java.demo;

public class Main {
    public static void main(String[] args) {

        Car car = new Car();

        //Car class inherits all methods and fields from parent class Transport, and has access to them
        car.setName("car");
        car.drive();

        //new car functional features
        car.signal();
        car.setNumber(12);
        System.out.println(car.getNumber());

        Transport transport = new Transport();

//        transport.signal(); // if you uncomment it, notice that transport object doesn't have unique fields and methods of car

    }
}
