package net.petriv.basepatterns.behavioral.observer;

import net.petriv.basepatterns.behavioral.iterator.JavaDeveloper;

public class JobSearch {
    public static void main(String[] args) {
        JavaDeveloperJob javaDeveloperJob = new JavaDeveloperJob();

        javaDeveloperJob.addVacancy("First java position");
        javaDeveloperJob.addVacancy("Second java position");

        Observer firstSubscriber = new Subscriber("Petriv Mykola ");
        Observer secondSubscriber = new Subscriber("Petriv Olexander ");

        javaDeveloperJob.addObserver(firstSubscriber);
        javaDeveloperJob.addObserver(secondSubscriber);

        javaDeveloperJob.addVacancy("Third java position");
    }
}
