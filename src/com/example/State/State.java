package com.example.State;

import java.util.Random;

/**
 * Created by: Iryna Borysenko
 * Date: 2/5/16
 */
public interface State {
    void doAction(Context context);
}

class StateHolder {
    static final State startCleaner = new StartCleaner();
    static final State closeCleaner = new CloseCleaner();
    static final State defragDisk = new DefragDisk();
    static final State cleanRegister = new CleanRegister();
    static final State setAutoload = new SetAutoload();
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

    public void startDefrag() {

    }

    public void searchForDataToDel() {

    }

    public void chooseStatusOfProg() {

    }

    public void endAllProcess() {

    }

    public void doAction() {
        state.doAction(this);
    }

}

class RandomState {
    public static CleanerStates getRandomState() {
        Random random = new Random();
        CleanerStates randoms = CleanerStates.values()[random.nextInt(CleanerStates.values().length)];
        return randoms;
    }
}

class StartCleaner implements State {

    @Override
    public void doAction(Context context) {

        switch (RandomState.getRandomState()) {
            case DEFRAG:
                context.startDefrag();
                context.setState(StateHolder.defragDisk);
                break;
            case CLEANREG:
                context.searchForDataToDel();
                context.setState(StateHolder.cleanRegister);
                break;
            case AUTOLOAD:
                context.chooseStatusOfProg();
                context.setState(StateHolder.setAutoload);
                break;
            case CLOSE:
                context.endAllProcess();
                context.setState(StateHolder.closeCleaner);
                break;
        }

    }
}

class DefragDisk implements State {

    @Override
    public void doAction(Context context) {
        switch (RandomState.getRandomState()) {
            case CLEANREG:
                context.searchForDataToDel();
                context.setState(StateHolder.cleanRegister);
                break;
            case AUTOLOAD:
                context.chooseStatusOfProg();
                context.setState(StateHolder.setAutoload);
                break;
            case CLOSE:
                context.endAllProcess();
                context.setState(StateHolder.closeCleaner);
                break;
            default:
                context.setState(StateHolder.defragDisk);
                context.doAction();
        }
    }
}

class CleanRegister implements State {

    @Override
    public void doAction(Context context) {
        switch (RandomState.getRandomState()) {
            case DEFRAG:
                context.startDefrag();
                context.setState(StateHolder.defragDisk);
                break;
            case AUTOLOAD:
                context.chooseStatusOfProg();
                context.setState(StateHolder.setAutoload);
                break;
            case CLOSE:
                context.endAllProcess();
                context.setState(StateHolder.closeCleaner);
                break;
            default:
                context.setState(StateHolder.cleanRegister);
                context.doAction();
                break;
        }
    }
}

class SetAutoload implements State {

    @Override
    public void doAction(Context context) {
        switch (RandomState.getRandomState()) {
            case DEFRAG:
                context.startDefrag();
                context.setState(StateHolder.defragDisk);
                break;
            case CLEANREG:
                context.searchForDataToDel();
                context.setState(StateHolder.cleanRegister);
                break;
            case CLOSE:
                context.endAllProcess();
                context.setState(StateHolder.closeCleaner);
                break;
            default:
                context.setState(StateHolder.setAutoload);
                context.doAction();
        }
    }
}

class CloseCleaner implements State {

    @Override
    public void doAction(Context context) {
        context.endAllProcess();
        context.setState(StateHolder.closeCleaner);
    }
}