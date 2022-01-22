package com.company.devices;

import com.company.animals.Human;

public class Main {
    public static void main(String[] args) {

        Car fiat = new Car("Ford", "Mustang", 2016);
        Car passerati = new Car("Jaguar", "XJ220", 2004);
        Phone iphone = new Phone( "Honor", "20", 2020, (int) 4.3, 3);
        Phone xiaomi = new Phone("xiaomi", "mi8", 2018, 6.8, 8, "Android",
                System.out.println("model: " + fiat.model);
        System.out.println("producer:" + fiat.producer);
        System.out.println("rok produkcji: " + fiat.yearOfProduction);
        System.out.println(fiat);

        System.out.println(iphone.getRamSize());
        System.out.println(xiaomi.getRamSize());

        Human me = new Human();
        System.out.println(me.getSalary());

        me.setSalary(1000.00);

        me.feed();
        me.takeForAWalk();
        System.out.println(me.species);
        System.out.println(me.weight);
        System.out.println(me.firstName);
    }
}