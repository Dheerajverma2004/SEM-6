package AP.LAB4.DecoratorDesignPattern;

public class Soda extends Decorator {
    Soda(Offering offering){
        this.offering = offering;
    }

    String getName(){
        return offering.getName() + " with Soda";
    }
    Integer getPrice(){
        return offering.getPrice() + 15;
    }
}
