package com.example.Singleton;

import java.util.ArrayList;

/**
 * Created by: Iryna Borysenko
 * Date: 2/2/16
 */


public class Singleton {

    private static volatile Singleton INSTANSE;
    /**
     * or where should I init it??
     */
    private int someParam;
    private int numberOfRockets = 4;
    private int numberOfSatellites = 1;
    ArrayList workersOnStation = new ArrayList();
    ArrayList workersOnEarth = new ArrayList();


    private Singleton() {
        /**
         * can I do it here??
         */
        workersOnEarth.add("Petrov");
        workersOnEarth.add("Ivanov");
    }

    public static Singleton getInstance(int param) {
        if (INSTANSE == null) {
            synchronized (Singleton.class) {
                if (INSTANSE == null) {
                    INSTANSE = new Singleton();
                }
            }
        }

        INSTANSE.setParam(param);
        return INSTANSE;
    }

    public Singleton setParam(int param) {
        someParam = param;
        return this;
    }

    public void flyToTheMoon() {
        if (numberOfRockets > 0) {
            System.out.println("We fly to the moon");
            --numberOfRockets;
        } else {
            System.out.println("All rockets were lent");
        }
    }

    public void flyAroundTheEarth(int numberOfCircles) {
        System.out.println("We flew around Earth " + numberOfCircles + " times");
    }

    public void launchSatellite() {

        if (numberOfSatellites > 0) {
            System.out.println("We launched satellite");
            --numberOfSatellites;
        } else {
            System.out.println("All satellites were lent");
        }
    }

    public void changeWorkerOnStation(String nameWorkerToEarth, String nameWorkerToStation) {
        workersOnStation.add(nameWorkerToStation);
        workersOnEarth.remove(nameWorkerToEarth);
        System.out.println("Number of workers on Earth is " + workersOnEarth);
        System.out.println("Number of workers on Station is " + workersOnStation);
    }
}

class A {
    public static void main(String... args) {
        final Singleton singleton = Singleton.getInstance(1);

        singleton.flyToTheMoon();
        singleton.flyToTheMoon();
        singleton.flyToTheMoon();
        singleton.flyToTheMoon();
        singleton.flyToTheMoon();

        singleton.flyAroundTheEarth(5);

        singleton.launchSatellite();
        singleton.launchSatellite();

        singleton.changeWorkerOnStation("Ivanov", "Sydorov");
    }
}




//public class Singleton {
//    private static volatile Singleton INSTANSE;
//
//    public static Singleton getInstance() {
//        if (INSTANSE == null) {
//            synchronized (Singleton.class) {
//                if (INSTANSE == null) {
//                    INSTANSE = new Singleton();
//                }
//            }
//        }
//        return INSTANSE;
//    }
//}


//???????????????????
//
//public enum Singleton {
//    INSTANCE;
//}
//???????????????????

//    private static final Singleton INSTANCE = new Singleton();
//
//    public static Singleton getInstance()
//    {
//        return INSTANCE;
//    }
//    private Singleton() {
//
//    }

