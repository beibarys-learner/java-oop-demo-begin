package kz.java.demo.carmodel.motorbike;

public class Ural extends Motorbike {
    public Ural() {
    }

    public Ural(String name, String model, String color, double volume, boolean firstAidKit) {
        super(name, model, color, volume);
        this.firstAidKit = firstAidKit;
    }

    private boolean firstAidKit;

    public boolean isFirstAidKit() {
        // isBoolean, not GetFirstAidKit
        return firstAidKit;
    }

    public void setFirstAidKit(boolean firstAidKit) {
        this.firstAidKit = firstAidKit;
    }
    
    public void showInfo(){
        System.out.println("getName() = " + getName());
        System.out.println("getVolume() = " + getVolume());
        System.out.println("isFirstAidKit() = " + isFirstAidKit());
    }
    
}
