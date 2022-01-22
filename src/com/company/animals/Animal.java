package com.company.animals;

public class Animal {
    private String species;
    private boolean canFly;
    private int legs;
    public boolean isAlive;
    public double weight;

    public Animal(String species, boolean canFly, int legs, boolean isAlive, double weight) {
        this.species = species;
        this.canFly = canFly;
        this.legs = legs;
        this.isAlive = isAlive;
        this.weight = weight;
    }

    public void feed() {
        if(!this.isAlive) {
            System.out.println("Nie mozesz nakarmic nie żyjacego zwierzaka, HALO POLICJA!!");
            return;
        }
        this.weight += 1.0;
        System.out.println(this.species + " nakarmiony, teraz wazy " + this.weight + "kg");
    }

    public String getSpecies() {
        return species;
    }

    public void feed(){
        this.feed(DEFAULT_FOOD_WEIGHT);
    }

    public void feed(Double foodWeight){
        if (this.isAlive){
            this.weight += foodWeight;
            System.out.println("thx for food");
        }else {
            System.out.println("too late bro");
        }
    }
    public double getWeight() {
        return weight;
    }

    public void GoForWalk() {
        if(!this.isAlive) {
            System.out.println("Nie mozesz wyprowadzic martwego zwierzaka, halo policja!!");
            return;
        }

        this.weight -= 1.0;
        if(this.weight <= 0.0) {
            this.isAlive = false;
            System.out.println(this.species + " umarl");
        }
    }
    public void feed(Double foodWeight){

    }

    private class DEFAULT_FOOD_WEIGHT {
    }
}
