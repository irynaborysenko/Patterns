package com.example.FactoryMethod;

/**
 * Created by: Iryna Borysenko
 * Date: 2/8/16
 */
class Product {

}

class Spoon extends Product {
}

class Candle extends Product {
}

abstract class Creator {
    public abstract Product factoryMethod();
}

class CreatorCandle extends Creator {
    @Override
    public Product factoryMethod() {
        return new Candle();
    }
}

class CreatorSpoon extends Creator {
    @Override
    public Product factoryMethod() {
        return new Spoon();
    }
}

public class TestFactoryMethod {
    public static void main(String... args) {
        Creator creator = new CreatorSpoon();
        Product product = creator.factoryMethod();
        System.out.println(product);

        Creator[] creators = {new CreatorSpoon(), new CreatorCandle(), new CreatorCandle()};
        for (Creator c : creators) {
            Product prod = creator.factoryMethod();
            System.out.println(prod);
        }
    }
}