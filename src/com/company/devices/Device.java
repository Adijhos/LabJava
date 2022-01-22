package com.company.devices;

public class Device {
    public final String producer;
    public final String model;
    public final Integer yearOfProduction;
    public String color;

    public Device(String producer, String model, Integer yearOfProduction) {
        this.producer = producer;
        this.model = model;
        this.yearOfProduction = yearOfProduction;
        this.color = color;
    }
    public String getProducer(){
        return producer;
    }
    public String getModel(){
        return model;
    }
    public Integer getYearOfProduction(){
        return yearOfProduction;
    }
    public String getColor(){
        return color;
    }
    public Integer getAge(){
        return 2021 - yearOfProduction + 1 ;
    }
    public void turnOn(){
        System.out.println("Wsciskam guzik");
        System.out.println("Czekam");
        System.out.println("Czekam");
        System.out.println("Czekam");
        System.out.println("Czekam");
        System.out.println("o jest, logo się wyświetla");
    }
    public boolean isTurnedOn(){
        return true;
    }


}
