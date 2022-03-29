package singleton;

public class LazyRegistry {
    private LazyRegistry() {
        System.out.println("In LazyRegistry singleton");
    }

    private static class RegistryHolder {
        static LazyRegistry INSTANACE = new LazyRegistry();
    }

    public static LazyRegistry getInstance() {
        return RegistryHolder.INSTANACE;
    }
}
