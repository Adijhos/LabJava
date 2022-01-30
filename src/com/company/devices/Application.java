package com.company.devices;

public class Application {
    public String name;
    public String version;
    public Double price;
    public boolean appIsInstalled;

    public Application(String name, String version, Double price) {
        this.name = name;
        this.version = version;
        this.price = price;
        this.appIsInstalled = false;
    }

    public Double getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }

    public String toString() {
        return "app name: " + name + " Version: " + version + " Price: " + price;
    }

}