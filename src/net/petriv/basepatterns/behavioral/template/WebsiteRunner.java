package net.petriv.basepatterns.behavioral.template;

public class WebsiteRunner {

    public static void main(String[] args) {

        WebsiteTemplate welcomPage = new WelcomPage();
        WebsiteTemplate newsPage = new NewsPage();

        welcomPage.showPage();

        System.out.println("*******************************");

        newsPage.showPage();

    }
}
