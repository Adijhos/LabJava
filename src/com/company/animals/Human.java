package com.company.animals;

import com.company.devices.Car;
import com.company.devices.Phone;

public class Human {
    String firstName;
    String lastName;
    private Double salary;
    public Double cash;
    Car car;
    Phone mobile;
    Animal pet;

    public Human(String species){
        super("homo sapiens");
        this.salary = 0.0;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        if ((salary <0)){
            System.out.println("Nikt nie bedzie pracowac za darmo");
        }
        this.salary = salary;
    }

}
