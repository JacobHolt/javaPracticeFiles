package com.Inheritance;

public class Animal {

    private String name;
    private int brain;
    private int body;
    private int size;
    private int weight;

    public int getBrain() {
        return brain;
    }
    public int getBody() {
        return body;
    }
    public int getSize() {
        return size;
    }
    public int getWeight() {
        return weight;
    }
    public String getName() {
        return name;
    }

    public Animal(String name, int brain, int body, int size, int weight) {
        this.brain = brain;
        this.body = body;
        this.size = size;
        this.weight = weight;
        this.name = name;
    }

    public void eat() {
        System.out.println("Animal eat pulled");
    }

    public void move(int speed) {
        System.out.println("Animal.move() called. Animal is moving at " + speed);

    }
}
