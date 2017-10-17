package net.petriv.basepatterns.behavioral.command;

public class UpdateCommond implements Command {
    Database database;

    public UpdateCommond(Database database) {
        this.database = database;
    }

    @Override
    public void execute() {
        database.update();
    }
}
