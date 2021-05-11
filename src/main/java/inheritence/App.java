package inheritence;

public class App {
    public static void main(String[] args) {
        A a = new B();
        a.get();
        B b = (B) a;
        b.get();
        C c = (C) b;
        c.get();

    }
}
