package singleton;

public class Client {

    public static void main(String[] args) {

        EarlyRegistry registry=EarlyRegistry.getInstance();
        EarlyRegistry registry2=EarlyRegistry.getInstance();

        System.out.println(registry == registry2);


        LazyRegistry singleton;
        singleton = LazyRegistry.getInstance();
        LazyRegistry singleton2 = LazyRegistry.getInstance();

        System.out.println(singleton == singleton2);
    }
}
