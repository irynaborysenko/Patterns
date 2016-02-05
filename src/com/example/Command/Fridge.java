package com.example.Command;

/**
 * Created by: Iryna Borysenko
 * Date: 2/4/16
 */

/**
 * receiver
 */
public class Fridge {
    public Fridge() {
    }

    public void openDoor() {
        System.out.println("The fridge is open now");
    }

    public void takeFood() {
        System.out.println("The food has been taken of a fridge");
    }

    public void putFood() {
        System.out.println("The food has been put in a fridge");
    }

    public void closeDoor() {
        System.out.println("The fridge is close now");
    }
}