package singleton;

public class Main {
    public static void main(String ... args) {
        var lazySingleton = LazySingleton.getInstance();
        System.out.println(lazySingleton);
        lazySingleton = LazySingleton.getInstance();
        System.out.println(lazySingleton);

        var eagerSingleton = EagerSingleton.getInstance();
        System.out.println(eagerSingleton);
        eagerSingleton = EagerSingleton.getInstance();
        System.out.println(eagerSingleton);

        var lazyHolderSingletorn = LazyHolderSingleton.getInstance();
        System.out.println(lazyHolderSingletorn);
        lazyHolderSingletorn = LazyHolderSingleton.getInstance();
        System.out.println(lazyHolderSingletorn);
    }
}
