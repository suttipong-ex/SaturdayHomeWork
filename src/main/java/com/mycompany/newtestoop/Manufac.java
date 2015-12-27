/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.newtestoop;

/**
 *
 * @author Suttipong
 */
public class Manufac {
    private String brand;
    private String name;
    private int price;
    public void setBrand(String brand){
        this.brand = brand;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setPrice(int price){
         this.price = price;
    }

    public String getBrand() {
        return brand;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }
    
}
