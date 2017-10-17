package net.petriv.basepatterns.behavioral.iterator;

public class JavaDeveloperRunner {
    public static void main(String[] args) {
        String[] skils = {"Java" , "Spring" , "Maven"};
        JavaDeveloper javaDeveloper = new JavaDeveloper("Petriv Mykola" , skils);

        Iterator iterator = javaDeveloper.getIterator();
        System.out.println("Developer " + javaDeveloper.getName());
        System.out.println("Skills: ");

        while (iterator.hasNext()){
            System.out.println(iterator.next().toString() + " ");
        }
    }
}
