package net.petriv.basepatterns.structural.bridge;

public class StockExchange extends Program {

    public StockExchange(Developer developer) {
        super(developer);
    }

    @Override
    public void developProgram() {
        System.out.println("Stock development in progress");
    developer.writeCode();

    }
}


