package net.petriv.basepatterns.structural.flyweight;

import java.util.ArrayList;
import java.util.List;

public class ProjectRunner {
    public static void main(String[] args) {
DeveloperFactory developerFactory = new DeveloperFactory();
        List<Developer> developers = new ArrayList<>();
        developers.add(developerFactory.getDeveloperBySpecial("java"));
        developers.add(developerFactory.getDeveloperBySpecial("java"));
        developers.add(developerFactory.getDeveloperBySpecial("c++"));
        developers.add(developerFactory.getDeveloperBySpecial("c++"));
        developers.add(developerFactory.getDeveloperBySpecial("c++"));
        developers.add(developerFactory.getDeveloperBySpecial("c++"));
        developers.add(developerFactory.getDeveloperBySpecial("c++"));
        developers.add(developerFactory.getDeveloperBySpecial("c++"));

        for (Developer developer : developers) {
            developer.writeCode();

        }
    }
}
