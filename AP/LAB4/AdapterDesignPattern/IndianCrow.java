package AP.LAB4.AdapterDesignPattern;

public class IndianCrow implements Crow{
    public void fly(){
        System.out.println("Indian Crow is flying high over mountains");
    }
    public void eat(){
        System.out.println("Indian Crow is eating pearls");
    }
    public void cry(){
        System.out.println("Indian Crow is cawing");
    }
}