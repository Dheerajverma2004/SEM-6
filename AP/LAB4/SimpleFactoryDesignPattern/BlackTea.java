package SimpleFactoryDesignPattern;

public class BlackTea implements Tea {
    @Override
    public String getType() {
        return "Black Tea";
    }

    @Override
    public double getPrice() {
        return 80;
    }
}