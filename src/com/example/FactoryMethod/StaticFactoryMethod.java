package com.example.FactoryMethod;

/**
 * Created by: Iryna Borysenko
 * Date: 2/8/16
 */
public class StaticFactoryMethod {
    public static void main(String... args) {

        System.out.println(Mail.letterFrom("Anton"));
        System.out.println(Mail.letterAnonim());
        System.out.println(Mail.letterFromPresident());
    }
}


class Mail {
    static String namePresident = "I'm President";

    private Mail(String nameSender) {

    }

    static Mail letterFrom(String name) {
        return new Mail(name);
    }

    static Mail letterAnonim() {
        return new Mail("Anonim");
    }

    static Mail letterFromPresident() {
        return new Mail(namePresident);
    }

}
