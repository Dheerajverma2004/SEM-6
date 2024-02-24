package SimpleFactoryDesignPattern;

public class GreenTea implements Tea {
    @Override
    public String getType() {
        return "Green Tea";
    }

    @Override
    public double getPrice() {
        return 100;
    }
}
