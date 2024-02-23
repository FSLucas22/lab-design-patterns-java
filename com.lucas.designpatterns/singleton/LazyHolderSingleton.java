package singleton;

/**
 * Singleton "Lazy Holder"
 * @see <a href="https://stackoverflow.com/a/24018148">Referência</a>
 * @author falvojr
 */
public class LazyHolderSingleton {
    private static final class InstanceHolder {
        public static final LazyHolderSingleton instance = new LazyHolderSingleton();
    }

    private LazyHolderSingleton() {
        super();
    }

    public static LazyHolderSingleton getInstance() {
        return InstanceHolder.instance;
    }
}
