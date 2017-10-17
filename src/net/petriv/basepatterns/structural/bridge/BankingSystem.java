package net.petriv.basepatterns.structural.bridge;

public class BankingSystem extends Program {

    public BankingSystem(Developer developer) {

        super(developer);
    }

    @Override
    public void developProgram() {
        System.out.println("Bank System developmrnt in progress...");
        developer.writeCode();
    }
}
