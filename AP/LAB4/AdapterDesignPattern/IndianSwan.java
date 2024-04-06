package AP.LAB4.AdapterDesignPattern;

public class IndianSwan implements Swan{
    public void swim(){
        System.out.println("Indian Swan is swimming in the lake");
    }
    public void eat(){
        System.out.println("Indian Swan is eating fish");
    }
    public void sing(){
        System.out.println("Indian Swan is singing");
    }
}