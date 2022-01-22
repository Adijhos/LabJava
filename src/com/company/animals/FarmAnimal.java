package com.company.animals;

public class FarmAnimal extends Animal implements Edible {
    public FarmAnimal(String species, boolean canFly, int legs, boolean isAlive, double weight) {
        super(species, canFly, legs, isAlive, weight);
    }

    @Override
    public void beEaten() {
        this.isAlive = false;
        this.weight = 0.0;
        System.out.println(this.species + "was eaten");
    }
}
