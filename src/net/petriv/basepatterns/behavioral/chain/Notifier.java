package net.petriv.basepatterns.behavioral.chain;

public abstract class Notifier {
    private int prioryty;
    private Notifier nextNotifier;

    public Notifier(int prioryty) {
        this.prioryty = prioryty;
    }

    public void setNextNotifier(Notifier nextNotifier) {
        this.nextNotifier = nextNotifier;
    }

    public void notifyManafer(String msg, int level) {
        if (level >= prioryty) {
            write(msg);
        }
        if (nextNotifier!= null) {
            nextNotifier.notifyManafer(msg, level);
        }
    }

    public abstract void write(String msg);
}


