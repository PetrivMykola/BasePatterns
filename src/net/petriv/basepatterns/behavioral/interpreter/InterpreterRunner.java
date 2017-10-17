package net.petriv.basepatterns.behavioral.interpreter;

public class InterpreterRunner {
    public static void main(String[] args) {
Expresion isJava = getJavaExpresion();
Expresion isJavaEEDeveloper = getJavaEEExpresion();
System.out.println("Does developer knows Java core " + isJava.interpret("java core"));
System.out.println("Does developer knows Java Ee " + isJavaEEDeveloper.interpret("java spring"));
    }

    public static Expresion getJavaExpresion() {
Expresion java = new TerminalExpresion("Java");
Expresion javacore = new TerminalExpresion("javacore");
return new OrExpresion(java, javacore);
    }

    public static Expresion getJavaEEExpresion() {
Expresion java = new TerminalExpresion("java");
Expresion spring = new TerminalExpresion("Spring");

return new AndExpresion(java, spring);
    }
}
