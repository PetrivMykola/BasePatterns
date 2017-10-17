package net.petriv.basepatterns.structural.proxy;

public class ProjectRunner {
    public static void main(String[] args) {
        Project project = new ProxyProject("www.github.com");
        project.run();

    }
}
