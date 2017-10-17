package net.petriv.basepatterns.behavioral.chain;

public class SimpleReportNotifier extends Notifier {

    public SimpleReportNotifier(int prioryty) {
        super(prioryty);
    }

    @Override
    public void write(String msg) {
        System.out.println("Notifying using simple report " + msg);
    }
}
