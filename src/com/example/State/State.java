package com.example.State;

/**
 * Created by: Iryna Borysenko
 * Date: 2/5/16
 */
public interface State {
    void doAction(Context context);
}

class Context {
    private State state;

    public Context() {
        state = null;
    }

    public void setState(State state) {
        this.state = state;
    }

    public State getState() {
        return state;
    }

    public void doAction() {
        state.doAction(this);
    }

}

class OffState implements State {

    public void doAction(Context context) {
        System.out.println("The computer off");
        context.setState(new TurnOnState());
    }
}

class TurnOnState implements State {

    public void doAction(Context context) {
        System.out.println("The computer turns on");
        context.setState(new OnState());
    }
}

class OnState implements State {

    public void doAction(Context context) {
        System.out.println("The computer on");
        context.setState(new InBrowserState());
    }
}

class InBrowserState implements State {

    public void doAction(Context context) {
        System.out.println("In the browser");
        context.setState(new InGameState());
    }
}

class InGameState implements State {

    public void doAction(Context context) {
        System.out.println("In the game");
        context.setState(new TurnOffState());
    }
}

class TurnOffState implements State {

    public void doAction(Context context) {
        System.out.println("The computer turns off");
        context.setState(new OffState());
    }
}