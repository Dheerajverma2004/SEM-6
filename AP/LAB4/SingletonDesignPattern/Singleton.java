// Write a program to develop a singleton design pattern java program to solve the problem of multiple objects in a multi-threaded environment.
package SingletonDesignPattern;

class Singleton {
    private static Singleton instance;
    static int counter = 0;
    private Singleton() {
        System.out.println("Singleton object created");
        counter++;
    }
    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }
}


