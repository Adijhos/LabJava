package com.company.animals;

public class Human {
    String firstName;
    String lastName;
    private Double salary;

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
