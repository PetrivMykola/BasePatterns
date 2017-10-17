package net.petriv.basepatterns.behavioral.chain;

public class SmsNotifier extends Notifier {
    public SmsNotifier(int prioryty) {
        super(prioryty);
    }

    @Override
    public void write(String msg) {
        System.out.println("Sending sms to manager " + msg);
    }
}
