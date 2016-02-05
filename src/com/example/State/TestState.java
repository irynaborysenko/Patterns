package com.example.State;

/**
 * Created by: Iryna Borysenko
 * Date: 2/5/16
 */
public class TestState {
    public static void main(String... args) {
        final Context context = new Context();

        /**
         * or I should do like this and change slightly the Context class??
         * context.setState(takeoffState);
         * context.doAction();
         */


        final TakeoffState takeoffState = new TakeoffState();
        takeoffState.doAction(context);
        System.out.println(context.getState().toString());//well, let it be

        final FlyState flyState = new FlyState();
        flyState.doAction(context);
        System.out.println(context.getState().toString());

        final LandState landState = new LandState();
        landState.doAction(context);
        System.out.println(context.getState().toString());
    }
}