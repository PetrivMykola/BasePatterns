package net.petriv.basepatterns.structural.bridge;

public class ProcramCreator {
    public static void main(String[] args) {
        Program [] programs = {
                new BankingSystem(new JavaDeveloper()),
                new StockExchange(new CppDeveloper())

        };

        for (Program program : programs) {
            program.developProgram();
        }
    }
}
