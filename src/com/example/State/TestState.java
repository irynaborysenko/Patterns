package com.example.State;

/**
 * Created by: Iryna Borysenko
 * Date: 2/5/16
 */
public class TestState {
    public static void main(String... args) {
        final Context context = new Context();

        context.setState(StateHolder.startCleaner);

        context.doAction();
        context.doAction();
        context.doAction();
        context.doAction();
        context.doAction();
        context.doAction();
        context.doAction();
    }
}