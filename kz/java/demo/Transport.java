package kz.java.demo;

public class Transport {
    private String name;
    private String model;
    private String color;
    public static int year; // if you neglect static, result will be 2000, bmw 0

    public Transport() {
    }

    public Transport(String name, String model, String color) {
        this.name = name;
        this.model = model;
        this.color = color;
    }

    public void drive(){
        String hello = "Assalamu aleikum, Allahu Akbar ";
        System.out.println("");
        System.out.println(hello + name);
        System.out.println(name + " can drive");
    }
    public void stop(){
        System.out.println(name + " must stop");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    // optimizes code one static method for 100 objects like Transport, Car
    public static String formatText(String text){
        // non-static field name cannot be applied for static methods like formatText
        // System.out.println("name = " + name);
        return text + "!!!";
    }
}
