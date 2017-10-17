package net.petriv.basepatterns.creational.abstractfactory.website;

import net.petriv.basepatterns.creational.abstractfactory.ProjectManager;

public class WebsitePm implements ProjectManager {
    @Override
    public void manageProject() {
        System.out.println("Website Pm manage website project..");
    }
}
