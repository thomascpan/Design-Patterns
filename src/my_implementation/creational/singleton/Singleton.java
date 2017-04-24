package my_implementation.creational.singleton;

public class Singleton {
    private static Singleton instance;
    public String value;

    private Singleton(String message) {
        this.value = message;
    }

    public synchronized static Singleton getInstance(String value) {
        if (instance == null) {
            instance = new Singleton(value);
        }
        return instance;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
