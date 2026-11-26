package Zadanie6;

import java.io.IOError;
import java.util.*;


class Usage {
    public static void example(String[] args) {
        User auditor = new DbUserDataSource().findByRole("auditor")
                .orElseGet(userFactory::createAuditor);
    }
}

interface UserDataSource {
    Optional<User> findByRole(String role) throws IOError;
}

class JsonUserDataSource implements UserDataSource {
    public Optional<User> findByRole(String role) {
        Map<String, User> usersFromFile = JsonRoles.queryForUser();
        return Optional.ofNullable(usersFromFile.get(role));
    }
}

class DbUserDataSource implements UserDataSource {
    public Optional<User> findByRole(String role) {

        return Optional.ofNullable(BDAction.queryForUser(role));

    }
}

class BDAction {
    public static User queryForUser(String role) {
        if (role.equals("admin")) {
            return new User("admin");
        } else if (role.equals("user")) {
            return new User("user");
        }
        return null;
    }
}

class JsonRoles {
    public static Map<String, User> queryForUser() {
        Map<String, User> users = new HashMap<String, User>();
        users.put("auditor", new User("admin"));
        users.put("user", new User("user"));
        return users;
    }
}

class User {
    private final String role;

    public User(String role) {
        this.role = role;
    }

    public String getRole() {
        return role;
    }
}

class userFactory {
    public static User createAuditor() {
        return new User("auditor");
    }
}