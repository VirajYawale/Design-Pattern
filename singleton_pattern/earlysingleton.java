package singleton_pattern;

public class earlysingleton {
    
    // Eager creation: instance exists as soon as class is loaded
    private static final earlysingleton INSTANCE = new earlysingleton();

    // Private constructor prevents external instantiation
    private earlysingleton() {
        System.out.println("Singleton initialized eagerly");
    }

    public static earlysingleton getInstance() { // make it sincronized
        return INSTANCE;
    }

    // Example method:
    public void doSomething() {
        System.out.println("Doing something with " + this);
    }
}