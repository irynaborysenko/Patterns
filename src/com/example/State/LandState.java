package com.example.State;

/**
 * Created by: Iryna Borysenko
 * Date: 2/5/16
 */
public class LandState implements State {

    public void doAction(Context context) {
        System.out.println("The plane lands");
        context.setState(this);
    }

    public String toString() {
        return "Land State";
    }
}