package net.petriv.basepatterns.behavioral.mediator;

public class SimpleUser implements User {
    Chat chat;
    String name;

    public SimpleUser(Chat chat, String name) {
        this.chat = chat;
        this.name = name;
    }

    public Chat getChat() {
        return chat;
    }

    public void setChat(Chat chat) {
        this.chat = chat;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void sendMesege(String msg) {
        chat.sendMesege(msg, this);
    }

    @Override
    public void getMesege(String msg) {
        System.out.println(this.name + "masege " + msg);
    }
}
