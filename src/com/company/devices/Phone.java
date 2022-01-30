package com.company.devices;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.Arrays;
import java.util.List;
import com.company.Application;
import com.company.animals.Human;

import java.util.ArrayList;

public class Phone extends Device {
    private static final String DEFAULT_APP_VERSION ="lastest" ;
    private static final String DEFAULT_APP_SERVER ="http.wsb.pl" ;
    final String producer;
    final String model;
    final int yearOfProduction;
    final int ram;
    final String ramText;
    int totalStorage;
    private String[] appNames;
    public List<Application> appList;

    public Phone(String producer, String model, int yearOfProduction, int ram, int totalStorage) {
        this.producer = producer;
        this.model = model;
        this.yearOfProduction = yearOfProduction;
        this.ram = ram;
        this.totalStorage = totalStorage;
        this.ramText = ram + "GB";
        this.appList = new ArrayList<>();
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
            this.installAnApp(appName, DEFAULT_APP_VERSION);
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
    public void installAnApp(Human human, Application appName){
        if(human.cash > appName.price){
            if(appList.contains(appName)){
                System.out.println("Ta aplikacja jest juz zainstalowana - " + appName.name);
            }else{
                appList.add(appName);
                human.cash -= appName.price;
                System.out.println("Sprawdzanie adresu ip");
                System.out.println("Pobieranie rozmiaru aplikacji");
                System.out.println("Sprawdzanie miejsca na telefonie oraz płatnosc");
                System.out.println("Pobieranie aplikacji");
                System.out.println("Instalacja " + appName.name);
                appName.appIsInstalled = true;
            }
        }
    }

    public void allFreeApps(){
        System.out.println("Lista akualnych darmowych aplikacji");
        int number = 0;
        for (Application app:appList) {
            if(app.price == null){
                System.out.println("1) " + app);
                number += 1;
            }
        }
        if(number == 0){
            System.out.println("Brak darmowych aplikacji do pobrania");
        }
    }

    public Double valueInstalledApps(){
        double value = Double.parseDouble(null);
        for (Application app:appList) {
            if(app.appIsInstalled){
                value += app.price;
            }
        }
        return value;
    }


    public void allInstalledAppNames(){
        System.out.println("Lista aplikacji w kolejnosci alfabetycznej: ");
        String[] tempNames = new String[appList.size()];
        int number = 0;
        for (Application app:appList) {
            if(app.appIsInstalled){
                tempNames[number] = app.name;
                number += 1;
            }
        }


            Arrays.sort(tempNames);
            for(int i = 0; i < tempNames.length; i ++){
                System.out.println(i+1 + ") " + tempNames[i]);
            }
        }
    }
}

