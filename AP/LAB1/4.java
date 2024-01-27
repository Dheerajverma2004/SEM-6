/*Create a class One and make a parameterized constructor One( int x){ } inside this class.
Create a class Two derived from One: class Two extends One { }. Now, compile One and
then Two. Hint: Class Two should not compile and must throw an error. Analyze the error and rectify it.  */

class One
{
    One(int x)
    {
        System.out.println("One");
    }
}
class Two extends One
{
    Two()
    {
        super(10);
        System.out.println("Two");
    }
}
public class 4
{
    public static void main(String[] args)
    {
        Two obj = new Two();
    }
}