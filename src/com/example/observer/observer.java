package com.example.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by: Iryna Borysenko
 * Date: 2/1/16
 */
public class observer {

    public static void main(String[] args) {

        Baby baby = new Baby();

        baby.attachObserver(new Mother());
        baby.attachObserver(new Dog());
        baby.attachObserver(new DogMaster());

        baby.babyPlay();
        baby.babyDog();
        baby.babyFall();
        baby.babyCry();

    }

    interface Observable {
        void attachObserver(Observer observer);
        void detachObsever(Observer observer);
        void notifyObservers(State state);
    }

    interface Observer {
        void onNotify(State state);
    }

    static class Baby implements Observable {

        private List<Observer> mObservers = new ArrayList<Observer>();
        private State mState;

        void babyPlay() {
            System.out.println("Baby play in sandbox.");
            mState = State.BABY_PLAY;
            notifyObservers(mState);
        }

        void babyDog() {
            System.out.println("Baby noticed the dog. Baby does to a dog.");
            mState = State.GO_DOG;
            notifyObservers(mState);
        }

        void babyFall() {
            System.out.println("Baby fell.");
            mState = State.BABY_FALL;
            notifyObservers(mState);
        }

        void babyCry()  {
            System.out.println("Baby starts to cry.");
            mState = State.BABY_CRY;
            notifyObservers(mState);
        }

        /**
         * I don't understand meaning of this strings
         */
        @Override
        public void attachObserver(Observer observer) {
            mObservers.add(observer);
        }

        @Override
        public void detachObsever(Observer observer) {
            mObservers.remove(observer);
        }

        @Override
        public void notifyObservers(State state) {
            for(Observer o : mObservers) {
                o.onNotify(state);
            }
        }
    }

    static class Mother implements Observer {

        @Override
        public void onNotify(State state) {

            switch (state) {
                case BABY_PLAY:
                    System.out.println("Mother talks to the other mothers.");
                    break;
                case GO_DOG:
                    System.out.println("Mother watching a baby.");
                    break;
                case BABY_FALL:
                    System.out.println("Mother runs to a baby.");
                    break;
                case BABY_CRY:
                    System.out.println("Mother seeking baby injury.");
                    break;
                default:
                    break;
            }
        }
    }

    static class Dog implements Observer {

        @Override
        public void onNotify(State state) {

            switch (state) {
                case BABY_PLAY:
                    System.out.println("Dog is looking for a bone.");
                    break;
                case GO_DOG:
                    System.out.println("Dog begins to run.");
                    break;
                case BABY_FALL:
                    System.out.println("Dog stopped.");
                    break;
                case BABY_CRY:
                    System.out.println("Dog goes away.");
                    break;
                default:
                    break;
            }
        }
    }

    static class DogMaster implements Observer {

        @Override
        public void onNotify(State state) {

            switch (state) {
                case BABY_PLAY:
                    System.out.println("Dog master is on the phone.");
                    break;
                case GO_DOG:
                    System.out.println("Dog master follow dog.");
                    break;
                case BABY_CRY:
                    System.out.println("Dog master doesn't hear voice from phone because of yell.");
                    break;
                default:
                    break;
            }
        }
    }
    enum State {
        BABY_PLAY, GO_DOG, BABY_FALL, BABY_CRY
    }

}
