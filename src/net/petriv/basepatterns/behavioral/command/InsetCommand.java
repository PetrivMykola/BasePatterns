package net.petriv.basepatterns.behavioral.command;

public class InsetCommand implements Command {
    Database database;

    public InsetCommand(Database database) {
        this.database = database;
    }

    @Override
    public void execute() {
        database.insert();
    }
}
