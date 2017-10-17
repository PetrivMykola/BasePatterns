package net.petriv.basepatterns.behavioral.chain;

public class BugTracker {
    public static void main(String[] args) {
        Notifier report = new SimpleReportNotifier(Priority.ROUTINE);
        Notifier emailreport = new EmailNotifier(Priority.IMPORTANT);
        Notifier smsreport = new SmsNotifier(Priority.ASAP);

        report.setNextNotifier(emailreport);
        emailreport.setNextNotifier(smsreport);
        report.notifyManafer("Everything ok " ,  Priority.ROUTINE);

        report.notifyManafer("Something wrong" , Priority.IMPORTANT);

        report.notifyManafer("Problem" , Priority.ASAP);
    }
}
