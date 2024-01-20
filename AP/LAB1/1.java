/*Make a class Mother with int x and void show ( ) as its members. Now create another
class Child that is derived from the Mother class. Create another class Application to
test the inheritance. */

class Mother
{
    int x;
    void show()
    {
        System.out.println("This is Mother class");
    }
}

class Child extends Mother
{
    void display()
    {
        System.out.println("This is Child class");
    }
}

