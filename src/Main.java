public class Main {
    public static void main(String[] args) {

        // Testes relacionados ao Design Pattern Singleton:

        SingletonLazy lary = SingletonLazy.getInstance();
        System.out.println(lary);

        SingletonEager eager = SingletonEager.getInstance();
        System.out.println(eager);

        SingletonLazyHolder lazyHolder = SingletonLazyHolder.getInstance();
        System.out.println(lazyHolder);
    }
}