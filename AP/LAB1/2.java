/*Make a function with the same return type, name of the function, number and type of
arguments in the Child class as they are in the Mother class. Change the string to be
displayed on the screen. For example, if Mother class version of show ( ) was displaying
“Hello World” then the child class version of show ( ) will display “Hello JUET”.*/

class Mother
{
    public void show()
    {
        System.out.println("Hello World");
    }
}

class Child extends Mother
{
    public void show()
    {
        System.out.println("Hello JUET");
    }
}

public class Main
{
    public static void main(String[] args)
    {
        Child obj = new Child();
        obj.show();
    }
}

