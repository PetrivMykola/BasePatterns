package net.petriv.basepatterns.creational.abstractfactory.banking;

import net.petriv.basepatterns.creational.abstractfactory.ProjectManager;

public class BankingPM implements ProjectManager {

    @Override
    public void manageProject() {
        System.out.println("Banking Pm manager banking project");
    }
}
