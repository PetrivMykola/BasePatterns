package net.petriv.basepatterns.creational.abstractfactory.website;

import net.petriv.basepatterns.creational.abstractfactory.Developer;
import net.petriv.basepatterns.creational.abstractfactory.ProjectManager;
import net.petriv.basepatterns.creational.abstractfactory.ProjectTeamFactory;
import net.petriv.basepatterns.creational.abstractfactory.Tester;

public class WebsiteTeamFactory implements ProjectTeamFactory {
    @Override
    public Developer getDeveloper() {
        return new PhpDeveloper();
    }

    @Override
    public Tester getTester() {
        return new ManualTester();
    }

    @Override
    public ProjectManager getProjectManager() {
        return new WebsitePm();
    }
}
