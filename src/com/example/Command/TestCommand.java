package com.example.Command;

/**
 * Created by: Iryna Borysenko
 * Date: 2/4/16
 */
public class TestCommand {
    public static void main(String... args) {
        Fridge fridge = new Fridge();
        Command closeTheDoorAction = new CloseTheDoorCommand(fridge);
        Command openTheDoorAction = new OpenTheDoorCommand(fridge);
        Command putTheFoodActon = new PutTheFoodCommand(fridge);
        Command takeTheFoodAction = new TakeTheFoodCommand(fridge);

        Switch s = new Switch(closeTheDoorAction, openTheDoorAction, putTheFoodActon, takeTheFoodAction);

        s.openDoor();
        s.putFood();
        s.takeFood();
        s.closeDoor();
    }
}