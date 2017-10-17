package net.petriv.basepatterns.behavioral.mediator;

import javax.jws.soap.SOAPBinding;
import java.util.ArrayList;
import java.util.List;

public class SimpleTextChat implements Chat {
    User admin;
    List<User> users = new ArrayList<>();

    public void setAdmin(User admin) {
        this.admin = admin;
    }

    public  void addUserToChat(User user) {
        this.users.add(user);
    }

    @Override
    public void sendMesege(String msg, User user) {
        for (User u : users) {
            if (u != user) {
                u.getMesege(msg);
            }
        }
        admin.getMesege(msg);
    }
}

