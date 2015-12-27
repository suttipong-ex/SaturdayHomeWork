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
public class Car implements Vehicle{
    @Override
    public void drive() {
        System.out.println("Car is driving");
    }
    @Override
    public void turnleft() {
         System.out.println("Car is turining left");
    }
    @Override
    public void turnright() {
         System.out.println("Car is turning right");
    }
    @Override
    public void forward() {
         System.out.println("Car is forwarding");
    }
    @Override
    public void reward() {
         System.out.println("Car is rewarding");
    }    
    @Override
    public void brake() {
        System.out.println("Car is braking");
    }
}
