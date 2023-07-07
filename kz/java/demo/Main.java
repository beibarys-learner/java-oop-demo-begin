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

        Car nissan2 = new Car();
        Car nissan3 = new Car("Teana", "White", "Business car");
        System.out.println(nissan3.getName() + " " + nissan3.getModel() + " " + nissan3.getColor());

        Car nissan4 = new Car("Qashqai");
        Car nissan5 = new Car("Teana", "White", "Business car", 12);

        System.out.println(nissan4.getName());

        /*
            you can create different objects from constructors - order
            - but there is no need in doing this
         */
        Car bmw1 = new Car("Name 1", 1);
        Car bmw2 = new Car(1, "Name 1");

    }
}
