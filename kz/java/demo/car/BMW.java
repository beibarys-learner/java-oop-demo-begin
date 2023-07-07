package kz.java.demo.car;

public class BMW extends Car {

    // super in constructors calls only above one class, and cannot go after in the inheritance chain
    public BMW(String name, String model, String color) {
        super(name, model, color);
    }

    public BMW() {
        // super(); computer call this even if we don't write it
    }

    @Override
    public void drive() {
        // super looks for Car's signal class (каждый встречный выше)
        super.signal();
        super.drive();
        System.out.println("drive bmw");
        // method overrides all parent methods
    }
}


