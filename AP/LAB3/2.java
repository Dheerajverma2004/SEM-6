/* Make an interface ‘Testable’ that contains a method declaration for display ( ).
a) Create a class ‘Test’ that implements Testable. Compile this class, and write your
observations.
b) Create another abstract class ‘AbsTest’ implements Testable. Compile this class,
and write your observations. */

interface Testable {
    public void display();
}

class Test implements Testable {
    public void display() {
        System.out.println("Hello");
    }
}

abstract class AbsTest implements Testable {
    public void display() {
        System.out.println("Hello");
    }
}


