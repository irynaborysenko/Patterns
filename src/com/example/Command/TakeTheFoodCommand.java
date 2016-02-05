package com.example.Command;

/**
 * Created by: Iryna Borysenko
 * Date: 2/5/16
 */
public class TakeTheFoodCommand implements Command {
    private Fridge theFridge;

    public TakeTheFoodCommand(Fridge fridge) {
        this.theFridge = fridge;
    }

    public void execute() {
//        theFridge.putFood();
        theFridge.takeFood();
    }
}
