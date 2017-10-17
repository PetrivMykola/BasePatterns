package net.petriv.basepatterns.creational.abstractfactory.website;

import net.petriv.basepatterns.creational.abstractfactory.Developer;

public class PhpDeveloper implements Developer {
    @Override
    public void writeCode() {
        System.out.println("Php Developer writes php code");
    }
}
