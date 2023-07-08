package kz.java.demo.robotmodel;

public class Terminator extends ARobot{
    public Terminator() {
    }

    public Terminator(String name) {
        super(name);
    }

    @Override
    public void move() {
        System.out.println("Terminator move");
    }

    @Override
    public void stop() {
        System.out.println("Terminator stop");
    }

    @Override
    public void flight() {
        System.out.println("Terminator flight");
    }

    @Override
    public void talk() {
        System.out.println("terminator talk");
    }
}
