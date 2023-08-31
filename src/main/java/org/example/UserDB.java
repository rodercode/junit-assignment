package org.example;
import java.util.ArrayList;
import java.util.List;

    public class UserDB {
        private List<User> users;

        public UserDB() {
            users = new ArrayList<>();
        }

        public void createUser(User user) {
            users.add(user);
        }
    }
