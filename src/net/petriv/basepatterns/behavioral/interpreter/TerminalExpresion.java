package net.petriv.basepatterns.behavioral.interpreter;

public class TerminalExpresion implements Expresion {
    private  String data;

    public TerminalExpresion(String data) {
        this.data = data;
    }

    @Override
    public boolean interpret(String context) {
        if (context.contains(data)){
            return true;
        }
        return false;
    }
}
