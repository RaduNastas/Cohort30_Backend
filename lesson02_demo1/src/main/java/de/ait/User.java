package de.ait;

public class User {
    String name;
    String email;
    public User(String name, String email) {
        this.name = name;
        this.email = email;
    }
    public String toString() {
        return name + " " + email;
    }
}
