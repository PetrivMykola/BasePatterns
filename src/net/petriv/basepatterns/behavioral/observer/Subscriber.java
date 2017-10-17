package net.petriv.basepatterns.behavioral.observer;

import java.util.List;

public class Subscriber implements Observer {
    String name;

    public Subscriber(String name) {
        this.name = name;
    }

    @Override
    public void handEvent(List<String> vacancies) {
        System.out.println("Dear " + name + "we have some changed" + vacancies);
    }
}
