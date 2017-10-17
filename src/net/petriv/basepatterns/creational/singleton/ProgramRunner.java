package net.petriv.basepatterns.creational.singleton;

public class ProgramRunner {
    public static void main(String[] args) {
        ProgramLogger .getProgramLogger().addLogInfo("First log");
        ProgramLogger .getProgramLogger().addLogInfo("Secong log");
        ProgramLogger .getProgramLogger().addLogInfo("Third log");

        ProgramLogger.getProgramLogger().showLogFile();
    }
}
