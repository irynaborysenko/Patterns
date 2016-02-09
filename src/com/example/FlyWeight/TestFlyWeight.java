package com.example.FlyWeight;

import java.util.*;

/**
 * Created by: Iryna Borysenko
 * Date: 2/9/16
 */

interface Primitive {
    public void draw();
}

class Elf implements Primitive {
    private int accuracy;
    private int height;
    private String location;

    public Elf(int accuracy) {
        this.accuracy = accuracy;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public void setLocation(String location) {
        this.location = location;

    }

    @Override
    public void draw() {
        System.out.println("Created elf with height " + height + " and accuracy " + accuracy + ", located in " + location + ".");
    }
}

abstract class PrimitiveFactory {

    private static Map<Integer, Elf> elfs;

    static {
        elfs = new HashMap<Integer, Elf>();
    }

    public static Elf createElf(int accuracy) {
        Elf elf = (Elf) elfs.get(accuracy);
        if (elfs.get(accuracy) == null) {
            elfs.put(accuracy, new Elf(accuracy));
            System.out.println("Creating elf with accuracy : " + accuracy);
        }
        return elfs.get(accuracy);
    }
}

public class TestFlyWeight {
    public static void main(String[] args) {

        for (int i = 0; i < 5; ++i) {
            Elf elf = PrimitiveFactory.createElf(40);
            elf.setHeight(30);
            elf.setLocation("Moor");
            elf.draw();
        }

        for (int i = 0; i < 5; ++i) {
            Elf elf = PrimitiveFactory.createElf(11);
            elf.setHeight(35);
            elf.setLocation("Forest");
            elf.draw();
        }

    }
}

