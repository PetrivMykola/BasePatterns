package net.petriv.basepatterns.behavioral.command;

public class DatabaseRunner {
    public static void main(String[] args) {
        Database database = new Database();
        Developer developer = new Developer(
                new InsetCommand(database),
                new UpdateCommond(database),
                new SelectCommand(database),
                new DeleteCommand(database));

        developer.insertRecord();
        developer.updateRecord();
        developer.selectRecord();
        developer.deleteRecord();
    }
}
