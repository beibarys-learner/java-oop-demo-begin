package kz.java.demo.robotmodel;

public class Main {
    public static void main(String[] args) {
        Robocop robocop = new Robocop();
        robocop.flight();
        robocop.setName("robo");
        System.out.println(robocop.getName());

        Terminator terminator = new Terminator();
        terminator.stop();
    }
}
