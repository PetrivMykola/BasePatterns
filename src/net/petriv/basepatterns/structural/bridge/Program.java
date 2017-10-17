package net.petriv.basepatterns.structural.bridge;

public abstract class Program {
    public Developer developer;

    protected Program(Developer developer) {

        this.developer = developer;
    }

    public abstract void developProgram();

}
