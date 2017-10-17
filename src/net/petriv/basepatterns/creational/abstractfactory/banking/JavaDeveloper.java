package net.petriv.basepatterns.creational.abstractfactory.banking;

import net.petriv.basepatterns.creational.abstractfactory.Developer;

public class JavaDeveloper implements Developer {
    @Override
    public void writeCode() {
        System.out.println("Java developer writes java code");

    }
}
