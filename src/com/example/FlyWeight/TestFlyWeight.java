package com.example.FlyWeight;

import java.util.*;

/**
 * Created by: Iryna Borysenko
 * Date: 2/9/16
 */

abstract class Creatures {
    public String creatureType;
    public int power;
    public String location;

    public abstract void draw();
}

class Elf extends Creatures {

    public Elf() {
        creatureType = "Elf";
        power = 20;
        location = "Forest";
    }

    @Override
    public void draw() {
        System.out.println("Created " + creatureType + "with power " + power + ", located in " + location + ".");
    }
}

class Ork extends Creatures {

    public Ork() {
        creatureType = "Ork";
        power = 50;
        location = "Moor";
    }

    @Override
    public void draw() {
        System.out.println("Created " + creatureType + "with power " + power + ", located in " + location + ".");
    }
}


class CreatureFactory {

    private HashMap<Integer, Creatures> creaturesMap = new HashMap<Integer, Creatures>();

    public Creatures getCreature(int creatureCode) {
        Creatures creature = creaturesMap.get(new Integer(creatureCode));
        if (creature == null) {
            switch (creatureCode) {
                case 1: {
                    creature = new Elf();
                    break;
                }
                case 2: {
                    creature = new Ork();
                    break;
                }
            }
            creaturesMap.put(creatureCode, creature);
        }
        return creature;
    }
}

public class TestFlyWeight {
    public static void main(String... args) {
        CreatureFactory creatureFactory = new CreatureFactory();
        Creatures creature1 = creatureFactory.getCreature(1);
        creature1.draw();
        System.out.println(creature1);

        Creatures creature2 = creatureFactory.getCreature(2);
        creature2.draw();
        System.out.println(creature2);

        Creatures creature3 = creatureFactory.getCreature(1);
        creature3.draw();
        System.out.println(creature3);

        Creatures creature4 = creatureFactory.getCreature(1);
        creature4.draw();
        System.out.println(creature4);
    }
}
