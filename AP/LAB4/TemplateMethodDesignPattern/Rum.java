//package TemplateMethodDesignPattern;

public class Rum extends Beverage {
    @Override
    protected void addCondiments(){
        System.out.println("Adding water...");
    }
}
