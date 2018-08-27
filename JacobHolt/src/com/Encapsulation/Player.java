package com.Encapsulation;

public class Player {

    public String fullName;
    public int health;
    public String weapon;

    public void losehealth(int damage) {
        this.health = this.health - damage;
        if(this.health <= 0) {
            System.out.println("Player knocked out");
            //reduce number of lives left
        }
    }

    public int healthRemaining() {
        return this.health;
    }

}
