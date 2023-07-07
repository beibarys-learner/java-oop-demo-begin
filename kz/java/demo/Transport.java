package kz.java.demo;

public class Transport {
    private String name;
    private String model;
    private String color;

    public Transport() {
    }

    public Transport(String name) {
        this.name = name;
    }

    public void drive(){
        String hello = "hello ";
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
}
