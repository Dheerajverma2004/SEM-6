package SimpleFactoryDesignPattern;

public class LemonTea implements Tea {
    @Override
    public String getType() {
        return "Lemon Tea";
    }

    @Override
    public double getPrice() {
        return 120;
    }
}
