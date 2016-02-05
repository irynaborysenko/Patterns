package com.example.State;

/**
 * Created by: Iryna Borysenko
 * Date: 2/5/16
 */
public class FlyState implements State {

    public void doAction(Context context) {
        System.out.println("The plane is flying");
        context.setState(this);
    }

    public String toString() {
        return "Fly State";
    }
}
