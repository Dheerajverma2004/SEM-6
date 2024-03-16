package AP.LAB4.DecoratorDesignPattern;

public class Main {
    public static void main(String[] args) {
        Offering offering = new Coffee();
        offering = new Rum(offering); //coffee is wrapped by rum decorator
        System.out.println(offering.getName());
        System.out.println(offering.getPrice());
    }
}