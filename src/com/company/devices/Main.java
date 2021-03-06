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

        Human student = new Human();
        Human teacher = new Human();
        Human dean = new Human();

        ford.value = 10000;
        tesla.value = 100000;
        citroen.value = 50000;
        student.cash = 23252.00;
        teacher.cash = 98642.00;
        dean.cash = 436436.00;

        student.addCar(ford);
        student.addCar(tesla);
        dean.addCar(citroen);

        System.out.println("Kto był włascicielem? " + ford.checkOwners());
        System.out.println("Kto był włascicielem? " + tesla.checkOwners());
        System.out.println("Liczba transakcji danego pojazdu: " + ford.transactionCount());

        student.carList();
        teacher.carList();
        dean.carList();

    }
}