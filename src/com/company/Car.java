package com.company;

public class Car {
    final String producer;
    final String model;
    final int yearOfProduction;
    String colour;
    Double engineVolume;

    public Car(String producer, String model, int yearOfProduction, String colour, Double engineVolume) {
        this.producer = producer;
        this.model = model;
        this.yearOfProduction = yearOfProduction;
        this.colour = colour;
        this.engineVolume = engineVolume;
    }

    public String toString() {
        return "Producer: " + this.producer + ", model: " + this.model;
    }
}
