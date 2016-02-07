package com.example.AbstractFactory;

/**
 * Created by: Iryna Borysenko
 * Date: 2/7/16
 */
public abstract class AbstractFactory {
    abstract FrameColor getColor(Colors color);

    abstract WidgetMenu getMenu(Menus menu);
}

class FactoryProducer {
    public static AbstractFactory getFactory(String choice) {

        if (choice.equalsIgnoreCase("MENU")) {
            return new ShapeFactory();

        } else if (choice.equalsIgnoreCase("COLOR")) {
            return new ColorFactory();
        }

        return null;
    }
}