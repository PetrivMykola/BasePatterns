package net.petriv.basepatterns.behavioral.observer;

import java.util.ArrayList;
import java.util.List;

public class JavaDeveloperJob implements Observed{
    List<String> vacancies = new ArrayList<>();

    List<Observer> subscribers = new ArrayList<>();

    public void addVacancy(String vacancy){
        this.vacancies.add(vacancy);
        notifyObserves();
    }

    public void removeVavancy(String vacancy) {
        this.vacancies.remove(vacancy);
    }

    @Override
    public void addObserver(Observer observer) {
        this.subscribers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        this.subscribers.remove(observer);

    }

    @Override
    public void notifyObserves() {
        for (Observer observer : subscribers) {
            observer.handEvent(this.vacancies);
        }
    }
}
