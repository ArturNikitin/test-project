package test.stream;

import classes.UserSex;

public class User {
    private String name;

    public User(String name, int i, UserSex male) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
