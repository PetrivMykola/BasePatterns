package net.petriv.basepatterns.behavioral.interpreter;

public class AndExpresion implements Expresion {

    private Expresion expresion1;
    private Expresion expresion2;

    public AndExpresion(Expresion expresion1, Expresion expresion2) {
        this.expresion1 = expresion1;
        this.expresion2 = expresion2;
    }

    @Override
    public boolean interpret(String context) {
        return expresion1.interpret(context) && expresion2.interpret(context);
    }
}
