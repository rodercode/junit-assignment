package org.example;

public class User {


    private String username;
    private String password;
    private int age;
    private int id;

    public User(String username, String password, int age) {
        this.username = username;
        this.password = password;
        this.age = age;
        this.id = 0;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
