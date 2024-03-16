package AP.LAB4.DecoratorDesignPattern;

public class Gin extends Decorator {
    Gin(Offering offering){
        this.offering = offering;
    }

    String getName(){
        return offering.getName() + " with Gin";
    }
    Integer getPrice(){
        return offering.getPrice() + 50;
    }
}
