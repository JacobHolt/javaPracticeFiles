package com.Composition;

public class Couch {

    private String brand;
    private int size;
    private String material;

    public Couch(String brand, int size, String material) {
        this.brand = brand;
        this.size = size;
        this.material = material;
    }

    public void foldOutCouch() {
        System.out.println("The couch is now a bed.");
    }

    public String getBrand() {
        return brand;
    }

    public int getSize() {
        return size;
    }

    public String getMaterial() {
        return material;
    }
}
