package com.company.devices;

import com.company.Saleable;
import com.company.animals.Human;
import java.util.List;

public class Car extends Device implements Saleable {
    public Double engineVolume;
    public Double oil;
    public Double capacitance;
    public Double gas;
    public List<Human> owners;
    public Human owner;
    public List<String> transactions;
    public List<Human> sellers;
    public List<Human> buyers;

    public String toString() {
        return "Producer: " + this.producer + ", model: " + this.model;
    }


    @Override
    public void sale(Human seller, Human buyer, Double price) {

    }
    public void sale(Human seller, Human buyer, Double price) {
        if (buyer.cash < price) {
            System.out.println("Sorry, nie stać cie");
        } else if (!seller.hasCar()) {
            System.out.println("Nie masz samochodu");
        } else if (!buyer.hasFreeSpace()) {
            System.out.println("Nie masz wolnego miejsca w garazu");
        } else {
            seller.cash += price;
            buyer.cash -= price;
            seller.removeCar(this);
            buyer.addCar(this) = this;
            System.out.println("udało sie sprzedac auto za" + price + "pln");
        }
    }

    public void carOwners(){
        System.out.println("Właściele danego samochodu : " + this);
        int number = 1;
        if(owners.size() == 0){
            System.out.println("Nie znaleziono informacji o właścicielach");
        }else{
            for (Human human : owners) {
                if(number == owners.size()){
                    this.owner = human;
                    System.out.println(number + ") " + this.owner + " - to właściciel tego pojazdu");
                }else{
                    System.out.println(number + ") " + human);
                    number += 1;
                }
            }
        }
    }

    public boolean checkOwners(){
        return owners.size() != 0;
    }

    public boolean checkSelling(Human seller, Human buyer){
        for (int i = 0; i < transactionCount(); i++) {
            if(sellers.contains(seller) && buyers.contains(buyer))
                if(sellers.get(i) == seller && buyers.get(i) == buyer){
                    return true;
                }
        }
        return false;
    }

    public Integer transactionCount(){
        int counter = 0;
        for (String transaction : transactions) {
            counter += 1;
        }
        return counter;
    }
}

