package net.petriv.basepatterns.behavioral.chain;

public class EmailNotifier extends Notifier {

    public EmailNotifier(int prioryty) {
        super(prioryty);
    }

    @Override
    public void write(String msg) {
        System.out.println("Sending email: " + msg);
    }
}
