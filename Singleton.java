public class Singleton {
//    Singleton is a design pattern that restricts the instantiation of a
//    class to one single instance and provides a global point of access to that instance.
//    The Singleton pattern ensures that only one instance of a class is created, and that instance is
//    reused throughout the application. This is useful when you want to control access to shared resources
//    (like a configuration object, a connection pool, or logging) across the application.
     private Singleton() {}

    // Inner static class responsible for holding the instance
    private static class SingletonHelper {
        // The static instance will only be created when this class is loaded
        private static final Singleton INSTANCE = new Singleton();
    }

    public static Singleton getInstance() {
        return SingletonHelper.INSTANCE;
    }

//    A more modern and elegant way to implement the Singleton pattern is using the Bill Pugh Singleton Design,
//    which leverages a static inner class.
//    this method is thread-safe and efficient because it takes advantage of the Java classloader mechanism
//    to ensure that the instance is created lazily and only when needed.

//    Classloader mechanism:
//    The Java ClassLoader ensures that the instance is created only once, even in a multithreaded environment.
}
