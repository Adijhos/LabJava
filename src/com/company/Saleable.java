package com.company;

import com.company.animals.Human;

import java.security.PublicKey;

public interface Saleable {
    public  void sale(Human seller, Human buyer, Double price);
    public Double getValue();
    public Double getPrice();
}
