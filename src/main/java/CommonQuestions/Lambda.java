package CommonQuestions;

public class Lambda {

    @FunctionalInterface
    interface Animal{
        void eat(String str);
    }

    static class Dog {
        void show(){
            Animal animal = (str) ->  System.out.println("Lion is the king of Jungle "+str);
            animal.eat("Sacchin");
        }
        void display(Animal animal){
            animal.eat("display");
        }
    }
    class Cat{
        void show(){
            Animal animal = s ->  System.out.println(s+" is the king of Jungle");
            animal.eat("Cat");
        }
    }

    public static void main(String[] args) {

        Lambda lambda = new Lambda();
        // Use the outer class instance to create an instance of the inner class (Dog)
        Dog dog = new Dog();
        dog.show();
        dog.display(str -> System.out.println("Hello dog " + str));

        Lambda.Cat cat=lambda.new Cat();
        cat.show();
    }


}
