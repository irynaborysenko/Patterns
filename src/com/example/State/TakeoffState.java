package com.example.State;

/**
 * Created by: Iryna Borysenko
 * Date: 2/5/16
 */
public class TakeoffState implements State {
    /**
     * should I write @override above each redefinition of doAction??
     */
    @Override
    public void doAction(Context context) {
        System.out.println("The plane takes off");
        context.setState(this);
    }

    public String toString() {
        return "Takeoff State";
    }
}