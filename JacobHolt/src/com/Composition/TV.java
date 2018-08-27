package com.Composition;

public class TV {

    private String brand;
    private int size;
    private int resolution;

    public TV(String brand, int size, int resolution) {
        this.brand = brand;
        this.size = size;
        this.resolution = resolution;
    }

    public void powerButton() {
        System.out.println("The TV is powering on...");
    }

    public String getBrand() {
        return brand;
    }

    public int getSize() {
        return size;
    }

    public int getResolution() {
        return resolution;
    }
}
