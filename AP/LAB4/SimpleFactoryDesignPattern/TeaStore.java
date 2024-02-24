package SimpleFactoryDesignPattern;

public class TeaStore {
    TeaFactory teaFactory = new TeaFactory();

    public Tea orderTea(String type) {
        Tea tea = teaFactory.createTea(type);
        return tea;
    }
}