package testcases;

import java.io.Serializable;

public interface TestInterface {
    default void doSomething() {
        System.out.println("TestInterface");
    }

    static void hello(String s) {
        System.out.println(s);
    }

    private void oops(int i) {

    }

}
