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
public class Truck implements Vehicle{
    @Override
    public void drive() {
        System.out.println("Truck is driving");
    }

    @Override
    public void brake() {
        System.out.println("Truck is braking");
    }

    @Override
    public void turnleft() {
        System.out.println("Truck is turning left");
    }

    @Override
    public void turnright() {
        System.out.println("Truck is turning right");
    }

    @Override
    public void forward() {
        System.out.println("Truck is forwarding");
    }

    @Override
    public void reward() {
        System.out.println("Truck is rewarding");
    }
    
}
