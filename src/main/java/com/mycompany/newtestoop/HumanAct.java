/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.newtestoop;

import java.util.Scanner;

/**
 *
 * @author Suttipong
 */
public class HumanAct {
    String name;
    String brand;
    int price;
    public void driving(Vehicle drive){
        drive.drive();
    }
    public void braking(Vehicle brake){
        brake.brake();
    }
    void turningleft(Vehicle left){
        left.turnleft();
    }
    void turningright(Vehicle right){
        right.turnright();
    }
    void forwarding(Vehicle forward){
        forward.forward();
    }
    void rewarding(Vehicle reward){
        reward.reward();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HumanAct ha = new HumanAct();
        Manufac ma  = new Manufac();
        System.out.println("What is the vehicle that you want(Car[1] : Motorcycle[2] : Truck[3])");
        System.out.print("> : ");
        String secType = sc.nextLine();
        if(secType.equals("1")){
            System.out.println("creating car");
            Car car = new Car();
            ma.setBrand("Honda");
            ma.setName("Yaris");
            ma.setPrice(599000);
            Driver driver = new Driver();
            ha.driving(driver);
        }else if(secType.equals("2")){
            System.out.println("creating motorcycle");
            Motorcycle motorcycle = new Motorcycle();
            ma.setBrand("Ducati");
            ma.setName("F11");
            ma.setPrice(50000);
            Briker briker = new Briker();
            ha.driving(briker);
        }else if(secType.equals("3")){
            System.out.println("creating truck");
            Truck truck = new Truck();
            ma.setBrand("Hino");
            ma.setName("f190");
            ma.setPrice(1900000);
            Trucker trucker = new Trucker();
            ha.driving(trucker);
        } else{
            System.out.println("Try again");
        }
    }
}
