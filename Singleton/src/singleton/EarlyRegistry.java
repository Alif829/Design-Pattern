package singleton;

public class EarlyRegistry {
    private EarlyRegistry() {

    }

    private static final EarlyRegistry INSTANCE = new EarlyRegistry();

    public static EarlyRegistry getInstance() {
        return INSTANCE;
    }
}
