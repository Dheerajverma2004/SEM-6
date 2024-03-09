//package TemplateMethodDesignPattern;

abstract public class Beverage {
    private void pour(int qty){
        System.out.println("Pouring" + qty + "ml of beverage");
    } 

    protected abstract void addCondiments();

    private void stir(){
        System.out.println("Stirring...");
    }   

    private void serve(){
        System.out.println("Serving...");
    }

    protected boolean hook(){
        return true;
    }

    final public void templateMethod(int qty){
        pour(qty);
        addCondiments();
        if(hook()){
            stir();   
        }
        serve();
    }
}
