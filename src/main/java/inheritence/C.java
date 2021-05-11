package inheritence;

public class C extends B {
    int j;

    public C(int id) {
        System.out.println("Hello");
    }

    @Override
    public void get() {
        System.out.println("Hello from c");
    }

    @Override
    public void getFromB() {
        System.out.println("Hello from unique C");
    }
}
