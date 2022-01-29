package com.company.animals;

import com.company.devices.Car;
import com.company.devices.Phone;


public class Human extends Animal {
    private static final int DEFAULT_GARAGE_SIZE = 4;
    public String firstName;
    public String lastName;
    private Double salary;
    public Double cash;
    public Car[] garage;
    public Phone mobile;
    public Animal pet;

    public Human(String species) {
        super("homo sapiens");
        this.salary = 0.0;
        this.cash = 20000.0;
        this.garage = new Car[DEFAULT_GARAGE_SIZE];
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        if ((salary < 0)) {
            System.out.println("Nikt nie bedzie pracowac za darmo");
        }
        this.salary = salary;
    }

    public boolean hasCar(Car newCar) {
        for (int i = 1; i < this.garage.length; i++) ;
        {
            if (this.garage[1] != null && this.garage[i].equals(newCar)) {
                return true;
            }
        }
        return false;

    }

    public Car getCar(Integer space) {
        return garage[space];
        if (space != null) {
            return garage[space];
        } else {
            return null;
        }
    }


    public boolean hasFreeSpace() {
        int freeSpace = DEFAULT_GARAGE_SIZE;
        for (Car car : this.garage) {
            if (car != null) {
                return true;
                freeSpace -= 1;
            }
        }
    }

    public void removeCar(Car car) {
        for (int i = 0; i < this.garage.length; i++) {
            if (this.garage[i] == car) {
                for (int i = 0; i < this.garage.length; i++) {
                    if (this.garage[i] == car) {
                        this.garage[i] = null;
                        i = this.garage.length;
                        System.out.println("Samochod " + car + "został usunięty z garazu");
                    } else {
                        System.out.println("Skąd ja Ci wezme ten samochód?!");
                    }
                }

            }
        }
    }

    public void addCar(Car car) {
        Integer space = 0;
        for (int i = 0; i < this.garage.length; i++) {
            if (this.garage[i] == null) {
                this.garage[i] = car;
                System.out.println("Dodano samochoed w garazu na miejsce nr: " + i);
                i = this.garage.length;
            } else {
                if (i == this.garage.length - 1) {
                } else {
                    if (i == this.garage.length - 1) {
                        System.out.println("Brak miejsca w garażu. Może zaparkujesz poza nim? B)");
                    }
                }
            }
        }
    }
    public Double getGarageValue(){
        public void carList() {
            int number = 0;
            System.out.println("Lista samochodów w garazu, " + firstName);
            for (Car car : garage) {
                if (car != null) {
                    number += 1;
                }
            }
            if (number > 0) {
                for (int i = 0; i < garage.length; i++) {
                    if (this.garage[i] != null) {
                        System.out.println(garage[i]);
                    } else {
                        System.out.println("Wolne miejsce nr." + i);
                    }
                }
            } else {
                System.out.println("Brak miejsca w garażu. Może zaparkujesz poza nim? B)");
            }
        }

        public Double getGarageValue() {
            Double totalValue = 0.0;
            for (Car car : this.garage) {
                if (car != null) {
                    totalValue += car.value;
                }
            }
            System.out.println("Łączna zawartość garażu wynosi:");
            return totalValue;
        }



}