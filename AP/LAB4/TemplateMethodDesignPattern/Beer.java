//package TemplateMethodDesignPattern;

public class Beer extends Beverage {
    @Override
    protected void addCondiments(){
        System.out.println("Adding ice cubes...");
    }
    @Override
    protected boolean hook(){
        return false;
    }
}
