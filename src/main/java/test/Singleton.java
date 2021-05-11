package test;

public class Singleton {

    private static volatile Singleton sin;

    private Singleton(){}

    public static Singleton getInstance() {
        Singleton singleton = sin;
        if (singleton == null) {
            synchronized (Singleton.class) {
                singleton = sin;
                if (singleton == null) {
                    singleton = new Singleton();
                }
                sin = singleton;
            }
        }
        return sin;
    }

}

class A {
    int i;

    public A(int i) {
        this.i = i;
    }
    private void get() {
        System.out.println();
    }
}

class B extends A{
    int j;

    public B(int i, int j) {
        super(i);
        this.j = j;
    }



    public B(int z) {
        this(z, z);
    }
}
