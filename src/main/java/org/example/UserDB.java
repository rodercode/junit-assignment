package org.example;
import java.util.ArrayList;
import java.util.List;

    public class UserDB {
        private List<User> users;

        public UserDB() {
            users = new ArrayList<>();
        }


        // System should provide a new user to create an account
        // The user are required to provide these follow info
        // Username, Password, Age
        public void createUser(User user) {
            users.add(user);
        }

        public List<User> getAllUsers(){
            return users;
        }
    }
