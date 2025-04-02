package Decorator_Design_Pattern;

public class SimpleCoffee implements Coffee {

    @Override
    public String getDescription() {
         return "Simple Coffee";
    }

    @Override
    public double getCost() {
        return 5.0;
    }
}
