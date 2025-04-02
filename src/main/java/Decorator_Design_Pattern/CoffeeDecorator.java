package Decorator_Design_Pattern;

public abstract class CoffeeDecorator implements Coffee{

    public Coffee coffee;

    public CoffeeDecorator(Coffee coffee) {
        this.coffee = coffee;
    }

   public String getDescription(){
       return coffee.getDescription();
   }

   public Double getPrice(){
        return coffee.getCost();
   }
}
