package com.company.devices;

import com.company.animals.Animal;
import com.company.animals.Human;
import com.company.animals.Pet;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

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
        System.out.println(me.getSpecies);
        System.out.println(me.getWeight);
        System.out.println(me.firstName);

        System.out.println(ford.getAge());

    Animal cat = new Pet("felis");

    Human brotherInLow = new Human();
    ford.sale(me, brotherInLow, 80000);

    iphone.installAnApp("messenger");
    iphone.installAnApp("tiktok");
    iphone.installAnApp("facebook");

        List<String> apps = new ArrayList<>();
        apps.add("yt");
        apps.add("twitter");
        apps.add("gmail");

        Integer[] numbers = {2,1,3,2};
        String[] days = {"pm", "wt", "śr", "czw"};
        Integer[] otherNumbers = new Integer[4];
        otherNumbers.[0] = 1;
        otherNumbers.[1] = 2;
        otherNumbers.[2] = 4;
        otherNumbers.[3] = 3;

        List<Integer> listOfNumbers = new LinkedList<>();
        listOfNumbers.add(2);
        listOfNumbers.add(1);
        listOfNumbers.add(15);

        Human[] family = new Human[4];
        family[0] = me;
        family[1] = me;
        family[0] = brotherInLow;

        List<Human> otherFamily = new LinkedList<>();
        otherFamily.add(me);
        otherFamily.add(me);
        otherFamily.add(brotherInLow);
        otherFamily.remove(1);

        Set<Human> anotherFamily = new LinkedList<>();
        anotherFamily.add(me);
        anotherFamily.add(me);
        anotherFamily.add(me);
        anotherFamily.add(brotherInLow);
        System.out.println(anotherFamily.size());


    }