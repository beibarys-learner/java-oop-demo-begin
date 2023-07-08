package kz.java.demo.carmodel.car;

public class BMW extends Car {

    // super in constructors calls only above one class, and cannot go after in the inheritance chain
    public BMW(String name, String model, String color) {
        super(name, model, color);
    }

    public BMW() {
    }

    @Override
    public void drive() {
        System.out.println("drive bmw");
        // method overrides all parent methods
    }
}


