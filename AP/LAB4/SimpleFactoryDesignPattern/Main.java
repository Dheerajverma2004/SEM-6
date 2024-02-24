package SimpleFactoryDesignPattern;
// Write a program to simulate Simple Factory Design Pattern for a tea store. The tea store has 3 types of tea: Green Tea, Black Tea, and Lemon Tea. The program should have a TeaStore class that has a method to create a tea object based on the type of tea. The program should have a Tea interface and 3 classes that implement the Tea interface: GreenTea, BlackTea, and LemonTea. The program should have a TeaFactory class that has a method to create a tea object based on the type of tea. The TeaStore class should use the TeaFactory class to create a tea object. The program should have a main method that demonstrates the use of the Simple Factory Design Pattern. The program should display the type of tea and the price of the tea. The program should solve the problem to open a class while adding a new type of tea to the store and use decoupling to solve the problem of new tea type addition to the store.

public class Main {
    public static void main(String[] args) {
        TeaStore teaStore = new TeaStore();
        Tea tea = teaStore.orderTea("GreenTea");
        System.out.println("Price of " + tea.getType() + " is " + tea.getPrice());
        tea = teaStore.orderTea("BlackTea");
        System.out.println("Price of " + tea.getType() + " is " + tea.getPrice());
        tea = teaStore.orderTea("LemonTea");
        System.out.println("Price of " + tea.getType() + " is " + tea.getPrice());
    }
}


