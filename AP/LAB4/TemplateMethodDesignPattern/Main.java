//package TemplateMethodDesignPattern;

public class Main {
    public static void main(String[] args) {
        Beverage b = new Beer();
        b.templateMethod(100);
        b = new Rum();
        b.templateMethod(100);
        b = new Whiskey();
        b.templateMethod(100);
    }
}
