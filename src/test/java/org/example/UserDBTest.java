package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UserDBTest {

    // System should provide the ability to create a new user
    // The user are required to provide these follow info to create an account
    // Username, Password, Age
    // also the system should generate an id value for every new user created
    // When a new account has been created the user should receive a message
    // "An account has been your account has been successfully created"

    @Test
    public void shouldCreateANewUser(){
        var userdb = new UserDB();
        userdb.createUser(new User("Roder", "1234",30));
        assertFalse(userdb.getAllUsers().isEmpty());
    }

    // The system shall provide a method for a user to check their own info
    // When users are authenticated within the system
    // content such: username, hidden password and age






}