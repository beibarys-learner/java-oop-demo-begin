package kz.java.demo.robotmodel;

public interface ITechnic {

    default void on(){
        System.out.println("default message");
    };
    default void off(){
        System.out.println("default message");
        on();
    };

}
