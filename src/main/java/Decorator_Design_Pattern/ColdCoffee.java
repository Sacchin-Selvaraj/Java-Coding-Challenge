package Decorator_Design_Pattern;

public class ColdCoffee extends CoffeeDecorator{

    public ColdCoffee(Coffee coffee) {
        super(coffee);
    }

    @Override
    public String getDescription() {
        return super.getDescription()+" milk";
    }

    @Override
    public double getCost() {
        return 0;
    }

    @Override
    public Double getPrice() {
        return super.getPrice()+5.0;
    }
}
