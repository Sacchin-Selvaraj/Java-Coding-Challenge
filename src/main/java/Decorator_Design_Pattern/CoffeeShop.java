package Decorator_Design_Pattern;

public class CoffeeShop {

    public static void main(String[] args) {

        Coffee coffee=new SimpleCoffee();
        System.out.println(coffee.getCost());
        System.out.println(coffee.getDescription());

        ColdCoffee coldCoffee=new ColdCoffee(coffee);
        System.out.println(coldCoffee.getDescription()+" "+coldCoffee.getPrice());
    }
}
