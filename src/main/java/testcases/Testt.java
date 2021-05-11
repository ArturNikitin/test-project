package testcases;

public interface Testt {
    default void doSomething() {
        System.out.println("Testt"  +  this.getClass());
    }
}
