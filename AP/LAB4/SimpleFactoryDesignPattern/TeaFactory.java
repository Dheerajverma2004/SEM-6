package SimpleFactoryDesignPattern;

public class TeaFactory {
    public Tea createTea(String type) {
        if (type.equals("GreenTea")) {
            return new GreenTea();
        } else if (type.equals("BlackTea")) {
            return new BlackTea();
        } else if (type.equals("LemonTea")) {
            return new LemonTea();
        } else {
            return null;
        }
    }
}
