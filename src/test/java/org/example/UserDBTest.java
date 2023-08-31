package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UserDBTest {

    // System should provide the ability to create a new user
    // The user are required to provide these follow info to create an account
    // Username, Password, Age
    // When a new account has been created the user should receive a message
    // "An account has been your account has been successfully created"

    @Test
    public void shouldCreateANewUser(){
        var userdb = new UserDB();
        userdb.createUser(new User("Roder", "1234",30));
        assertFalse(userdb.getAllUsers().isEmpty());
    }
}