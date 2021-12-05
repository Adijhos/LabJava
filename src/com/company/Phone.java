package com.company;

public class Phone {
    final String producer;
    final String model;
    final int yearOfProduction;
    final int ram;
    final String ramText;
    int totalStorage;

    public Phone(String producer, String model, int yearOfProduction, int ram, int totalStorage) {
        this.producer = producer;
        this.model = model;
        this.yearOfProduction = yearOfProduction;
        this.ram = ram;
        this.totalStorage = totalStorage;
        this.ramText = ram + "GB";
    }

    @Override
    public String toString() {
        return "Phone{" +
                "producer='" + producer + '\'' +
                ", model='" + model + '\'' +
                ", yearOfProduction=" + yearOfProduction +
                ", ramText='" + ramText + '\'' +
                ", totalStorage=" + totalStorage +
                '}';
    }
}
