package kz.java.demo.robotmodel;

public class AircraftWing implements Wing{
    private int size;
    @Override
    public void open() {

    }

    @Override
    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }
}
