package test;

class Test{}

public class TestUser {
    private String name;

    public String getName() {
        return name;
    }

    public TestUser(String name) {
        this.name = name;
    }


    @Override
    public String toString() {
        return "TestUser{" +
                "name='" + name + '\'' +
                '}';
    }
}
