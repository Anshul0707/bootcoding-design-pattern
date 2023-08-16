package designpattern.singleton;

public class Singleton {
    private static Singleton instance;

    private Singleton() {
        // Private constructor to prevent outside instantiation
    }

    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }

    public void showMessage() {
        System.out.println("Hello from Singleton!");
    }

    public static void main(String[] args) {
        Singleton singleton1 = Singleton.getInstance();
        Singleton singleton2 = Singleton.getInstance();

        singleton1.showMessage(); // Output: Hello from Singleton!
        singleton2.showMessage(); // Output: Hello from Singleton!

        System.out.println(singleton1 == singleton2); // Output: true (both refer to the same instance)
    }
}
