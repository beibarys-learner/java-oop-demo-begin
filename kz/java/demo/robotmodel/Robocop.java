package kz.java.demo.robotmodel;

public class Robocop extends ARobot{
    public Robocop() {
    }

    public Robocop(String name, IWing wing) {
        super(name, wing);
    }

    @Override
    public void move() {
        System.out.println("Robocop move");
    }

    @Override
    public void stop() {
        System.out.println("Robocop stop");
    }

    @Override
    public void flight() {
        System.out.println("Robocop flight with wing size" + getWing().getSize());
    }


    @Override
    public void talk() {
        System.out.println("robo talk");
    }

    @Override
    public void on() {
        System.out.println("on with beep");
    }
}
