package net.petriv.basepatterns.creational.abstractfactory;

public interface ProjectTeamFactory {
    Developer getDeveloper();
    Tester getTester();
    ProjectManager getProjectManager();
}