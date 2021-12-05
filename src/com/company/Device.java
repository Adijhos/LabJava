package com.company;

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
}
