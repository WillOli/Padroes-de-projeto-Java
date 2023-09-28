/**
 * Singleton "Lazy Holde"
 * @see <a href="http://stackoverflow.com/a/24018148">Referencia</a>
 *
 * @author william.oliveira
 */
public class SingletonLazyHolder {

    private static class InstanceHolder {
        public static SingletonLazyHolder instancia = new SingletonLazyHolder();
    }

    private SingletonLazyHolder(){
        super();
    }
    public static SingletonLazyHolder getInstance() {
        return InstanceHolder.instancia;
    }
}

