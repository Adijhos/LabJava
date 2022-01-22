package com.company.devices;

import com.company.Saleable;
import com.company.animals.Human;

public class Car extends Device implements Saleable {
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


    @Override
    public void sale(Human seller, Human buyer, Double price) {

    }
    public void sale(Human seller, Human buyer, Double price){
        if{buyer.cash < price){
        System.out.println("Sorry, nie stać cie");
    } else if(seller.car != this){
            System.out.println("Nie masz samochodu");
        } else {
            seller.cash += price;
            buyer.cash -= price;
            seller.car = null;
            buyer.car = this;
            System.out.println("udało sie sprzedac auto za" + price);
        }
}
