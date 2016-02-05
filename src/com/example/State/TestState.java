package com.example.State;

/**
 * Created by: Iryna Borysenko
 * Date: 2/5/16
 */
public class TestState {
    public static void main(String... args) {
        final Context context = new Context();
        final OffState offState = new OffState();

        context.setState(offState);

        context.doAction();
        context.doAction();
        context.doAction();
        context.doAction();
        context.doAction();
        context.doAction();
        context.doAction();
    }
}