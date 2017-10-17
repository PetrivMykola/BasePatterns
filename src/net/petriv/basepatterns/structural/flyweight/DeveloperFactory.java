package net.petriv.basepatterns.structural.flyweight;

import java.util.HashMap;
import java.util.Map;

public class DeveloperFactory {
    private static final Map<String, Developer> developers = new HashMap<>();

    public Developer getDeveloperBySpecial(String s) {
        Developer developer = developers.get(s);

        if (developer == null) {
            switch (s) {
                case "java" :
                    System.out.println("Hiring Java Developer");
                    developer = new JavaDeveloper() ;
                    break;
                case "c++":
                    System.out.println("Hiring c++ developer");
                    developer = new CppDeveloper();
                    break;
            }
            developers.put(s, developer);
        }
        return developer;
    }
}
