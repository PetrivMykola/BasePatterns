package net.petriv.basepatterns.structural.facade;

public class Developer {
    public void doJobBeforeDeadLine(BugTracker bugTracker) {
        if (bugTracker.isActiveSprint()) {
            System.out.println("Developer is solving problem");
        } else {
            System.out.println("Developer is reading Habrahabr");
        }
    }
}
