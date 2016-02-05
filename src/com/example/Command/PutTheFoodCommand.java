package com.example.Command;

/**
 * Created by: Iryna Borysenko
 * Date: 2/5/16
 */
public class PutTheFoodCommand implements Command {
    private Fridge theFridge;

    public PutTheFoodCommand(Fridge fridge) {
        this.theFridge = fridge;
    }

    public void execute() {
        theFridge.putFood();
    }
}
