/*Write another statement in Application class: Mother m1=new Child ( ); Now, call show
() with reference variable m1 and ‘.’ (dot) operator. Discuss the result with your
instructor. Now, make the method show ( ) static in Mother only and check the results
after executing Application. Repeat this by making show () static in Child only. Observe
the errors. Test whether the static methods are inheritable or not. Now make show ()
static in both Mother as well as in Child */

class Mother
{
    public static void show()
    {
        System.out.println("Hello World");
    }
}

class Child extends Mother
{
    public static void show()
    {
        System.out.println("Hello JUET");
    }
}

public class Main
{
    public static void main(String[] args)
    {
        Mother m1 = new Child();
        m1.show();
    }
}

