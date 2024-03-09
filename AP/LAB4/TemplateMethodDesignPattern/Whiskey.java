//package TemplateMethodDesignPattern;

public class Whiskey extends Beverage {
    @Override
    protected void addCondiments(){
        System.out.println("Adding water...");
    }
}
