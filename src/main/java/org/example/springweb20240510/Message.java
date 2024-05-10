package org.example.springweb20240510;

import java.util.Objects;

public class Message {

    private String id;
    private String name;
    private String message;

    public Message(String id, String name, String message) {
        this.id = id;
        this.name = name;
        this.message = message;
    }

    @Override
    public String toString() {
        return "Massage{" +
                "id='" + getId() + '\'' +
                ", name='" + getName() + '\'' +
                ", message='" + getMessage() + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;
        Message massage = (Message) o;
        return Objects.equals(id, massage.id) && Objects.equals(name, massage.name) && Objects.equals(message, massage.message);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, message);
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
