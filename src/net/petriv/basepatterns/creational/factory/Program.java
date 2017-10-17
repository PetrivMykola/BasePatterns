package net.petriv.basepatterns.creational.factory;

public class Program {
    public static void main(String[] args) {
        DeveloperFactory developerFactory = createDeveloperBy("java");
        Developer developer = developerFactory.createDeveloper();

        developer.writeCode();
    }

    static DeveloperFactory createDeveloperBy(String special) {
        if (special.equalsIgnoreCase("java")) {
            return new JavaDeveloperFactory();
        } else if (special.equalsIgnoreCase("c++")) {
            return new CppDeveloperFactory();
        } else {
            throw new RuntimeException();
        }
    }
}
