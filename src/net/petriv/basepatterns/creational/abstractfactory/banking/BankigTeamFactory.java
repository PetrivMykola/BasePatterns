package net.petriv.basepatterns.creational.abstractfactory.banking;

import net.petriv.basepatterns.creational.abstractfactory.Developer;
import net.petriv.basepatterns.creational.abstractfactory.ProjectManager;
import net.petriv.basepatterns.creational.abstractfactory.ProjectTeamFactory;
import net.petriv.basepatterns.creational.abstractfactory.Tester;


public class BankigTeamFactory implements ProjectTeamFactory {
    @Override
    public Developer getDeveloper() {
        return new JavaDeveloper();
    }

    @Override
    public Tester getTester() {
        return new QATester();
    }

    @Override
    public ProjectManager getProjectManager() {
        return new BankingPM();
    }
}
