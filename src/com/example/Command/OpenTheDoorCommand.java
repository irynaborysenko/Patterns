package com.example.Command;

/**
 * Created by: Iryna Borysenko
 * Date: 2/4/16
 */
public class OpenTheDoorCommand implements Command {
    private Fridge theFridge;

    public OpenTheDoorCommand(Fridge fridge) {
        this.theFridge = fridge;
    }

    public void execute() {
        theFridge.openDoor();
    }
}