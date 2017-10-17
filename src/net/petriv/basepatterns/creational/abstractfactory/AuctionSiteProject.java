package net.petriv.basepatterns.creational.abstractfactory;

import net.petriv.basepatterns.creational.abstractfactory.website.WebsiteTeamFactory;

public class AuctionSiteProject {
    public static void main(String[] args) {

        ProjectTeamFactory projectTeamFactory = new WebsiteTeamFactory();
        Developer developer = projectTeamFactory.getDeveloper();
        Tester tester = projectTeamFactory.getTester();
        ProjectManager projectManager = projectTeamFactory.getProjectManager();

    System.out.println("Creating auction website..");

    developer.writeCode();
    tester.testCode();
    projectManager.manageProject();
    }


}
