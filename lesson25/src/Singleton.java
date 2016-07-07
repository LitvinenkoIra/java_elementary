public class Singleton {

    public static Singleton INSTANCE;

    private Singleton() {
    }

    public Singleton newInstance() {
        if (INSTANCE == null) {
            INSTANCE = new Singleton();
        }
        return INSTANCE;
    }

    public void someAction() {
        System.out.println("Some action");
    }
}
