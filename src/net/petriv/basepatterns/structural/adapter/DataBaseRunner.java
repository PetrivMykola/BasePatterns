package net.petriv.basepatterns.structural.adapter;

public class DataBaseRunner {
    public static void main(String[] args) {
        DataBase dataBase = new AdapterJavaToDatabase();

        dataBase.insert();
        dataBase.remove();
        dataBase.select();
        dataBase.update();
    }
}
