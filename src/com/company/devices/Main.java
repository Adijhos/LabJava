package com.company.devices;

import com.company.animals.Animal;

public class Main {

    public static void main(String[] args) {

        Animal dog = new Animal("Burek", true, 3, true, 5.0);
        Animal cat = new Animal("Marek", false, 7, false, 2.5);

        Car firstCar = new Car("Porshe", "911", 2004, "Black", 3.0);
        Phone firstPhone = new Phone("Apple", "iPhone 11", 2020, 8, 64);

        System.out.println(firstPhone);
    }
}
