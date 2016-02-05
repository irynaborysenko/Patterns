package com.example.Command;

/**
 * Created by: Iryna Borysenko
 * Date: 2/4/16
 */
public class CloseTheDoorCommand implements Command {
    private Fridge theFridge;

    public CloseTheDoorCommand(Fridge fridge) {
        this.theFridge = fridge;
    }

    public void execute() {
        theFridge.closeDoor();
    }
}