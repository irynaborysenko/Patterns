package com.example.TemplateMethod;

/**
 * Created by: Iryna Borysenko
 * Date: 2/7/16
 */

class Linux extends OS {

    @Override
    protected void installOS() {
        System.out.println("linux");
    }

    @Override
    protected void configureOS() {
        // something we need
    }

    @Override
    protected void startOS() {
        // something we need
    }

    @Override
    protected void workOS() {
        // something we need
    }

    @Override
    protected void shutDownOs() {
        // something we need
    }

}

class Windows extends OS {

    @Override
    protected void installOS() {
        System.out.println("windows");
        // something we need
    }

    @Override
    protected void configureOS() {
        // something we need
    }

    @Override
    protected void startOS() {
        // something we need
    }

    @Override
    protected void workOS() {
        // something we need
    }

    @Override
    protected void shutDownOs() {
        // something we need
    }

}

class TestTemplateMethod {

    public static void main(String... args) {
        OS linux = new Linux();
        linux.OneFullSession();
        OS windows = new Windows();
        windows.OneFullSession();
    }

}
