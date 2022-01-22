package com.company.animals;

import com.company.Saleable;

public class Animal implements Saleable {
        final static Double DEFAULT_CAT_WEIGHT = 2.0;
        public static final Double DEFAULT_DOG_WEIGHT = 10.6;
        public static final double DEFAULT_WEIGHT = 1.0;
    private static final Object DEFAULT_FOOD_WEIGHT = ;

    final String species;
        protected Double weight;
        String name;
        Boolean isAlive;

    public String getSpecies() {
        return species;
    }

    public Double getWeight() {
        return weight;
    }

    public Animal(String species, Double foodWeight) {
    this.isAlive = true;
    this.species =species;
    if (this.species.equals("canis")) {
        this.weight = DEFAULT_DOG_WEIGHT;
    } else if (this.species.equals("felis")) {
        this.weight = DEFAULT_CAT_WEIGHT;
    } else {
        this.weight = DEFAULT_WEIGHT;
    }

    public void feed() {
        this.feed(DEFAULT_FOOD_WEIGHT);
    }

    public void feed(Double foodWeight){
        if (this.isAlive){
            this.weight += foodWeight;
            System.out.println("Dzieki za jedzenie");
        } else {
            System.out.println("too late");
        }
    }

    public void takeForAWalk() {
        if (this.isAlive) {
            this.weight -= 1;
            System.out.println("nice walk :D");
            if (this.weight =< 0){
                this.isAlive = false;
                }
            } else {
                System.out.println("POLICE HALO THERE IS SONE DEAD ANERAL HERE");
            }
        }
    }

    @Override
    public void sale(Human seller, Human buyer, Double price) {

    }
}