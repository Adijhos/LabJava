package com.company.devices;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

public class Phone {
    private static final String DEFAULT_APP_VERSION ="lastest" ;
    private static final String DEFAULT_APP_SERVER ="http.wsb.pl" ;
    final String producer;
    final String model;
    final int yearOfProduction;
    final int ram;
    final String ramText;
    int totalStorage;
    private String[] appNames;

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



    public  boolean isTurnedOn(){return true;}

    public void installAnApp(String appName){
        System.out.println("intsalowanie aplikacji z listy");
        for(String apName : appNames){
            this.installAnApp(appName);
        }
    }
    public void installAnApp(String appName, String version){
        this.installAnApp(appName, DEFAULT_APP_VERSION);
    }
    public void installAnApp(String appName,String version, String server){
        this.installAnApp(appName, DEFAULT_APP_SERVER);
    }
    public void installAnApp(List<String> appName, String server){
        try {
            URL url = new URL("https", server, 443, appName);
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
    }
    public void installAnApp(URL url){
        System.out.println("sprawdzanie miejsca docelowego");
        System.out.println("pobieranie aplikacji");
        System.out.println("rozpakowywanie aplikacji");
        System.out.println("instalacja aplikacji");



    }

    public boolean getRamSize() {
    }
}
