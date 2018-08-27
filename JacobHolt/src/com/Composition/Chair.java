package com.Composition;

public class Chair {

    private String brand;
    private String material;
    private int height;

    public Chair(String brand, String material, int height) {
        this.brand = "LazyBoy";
        this.material = "Leather";
        this.height = 5;
    }

    public void recline() {
        System.out.println("The chair is now reclined.");
    }

    public String getBrand() {
        return brand;
    }

    public String getMaterial() {
        return material;
    }

    public int getHeight() {
        return height;
    }
}
