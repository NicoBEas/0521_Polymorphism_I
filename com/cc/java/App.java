package com.cc.java;

public class App {
    
    public static void main(String[] args) {
     
        Honeybee worker = new Worker();
        Honeybee queen = new Queen();
        Honeybee drone = new Drone();

        output(worker.doYourJob());;
        output(queen.doYourJob());
        output(drone.doYourJob());

        Honeybee bee = new Honeybee();
        output(bee.doYourJob());

        output("----------------");

        output(worker.fly());
        output(queen.fly());
        output(drone.fly());
    }

    public static void output(String outputStr) {
        System.out.println(outputStr);
    }



}

