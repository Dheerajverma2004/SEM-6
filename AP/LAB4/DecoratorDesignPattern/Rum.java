package AP.LAB4.DecoratorDesignPattern;

public class Rum extends Decorator{
    Rum(Offering offering){
        this.offering = offering;
    }

    String getName(){
        return offering.getName() + " with Rum";
    }
    Integer getPrice(){
        return offering.getPrice() + 55;
    }
}
