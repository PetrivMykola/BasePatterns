package net.petriv.basepatterns.behavioral.mementor;

import java.util.Date;

public class Project {
    private  String version;
    private Date data;

    public void setVersionAndData(String version) {
        this.version = version;
        this.data = new Date();
    }



    public Save save() {
        return new Save(version);
    }

    public void load(Save save) {
        version = save.getVersion();
        data = save.getDate();
    }

    @Override
    public String toString() {
        return "Project{" +
                "version='" + version + '\'' +
                ", data=" + data +
                '}';
    }
}
