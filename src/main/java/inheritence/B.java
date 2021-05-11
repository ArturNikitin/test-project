package inheritence;

public class B extends A {
    int id;

    public B() {
        this.id = 1;
    }
    
    public B(Boolean b) {
        System.out.println("Hello");
    }

    @Override
    public void get() {
        System.out.println("Hello from B");
    }

    public void getFromB() {
        System.out.println("Hello from Unique B");
    }

}
