package Arrays;

public class AbstractClassJava {

    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.getName();



        System.out.println(dog.getNumber());
    }
}

class Animal{

    public Animal() {
        System.out.println("Animal Called");
    }

    void getName(){
        System.out.println("Animal Name called");
    }

    public int getNumber(){
        try {
            System.out.println("Inside Try Block");
            int num=5/0;
            return 3;
        }catch (Throwable t){
            System.out.println("Inside Catch Block");
            return 5;
        }
        finally {
            System.out.println("Inside Finally Block");
            return 7;
        }


    }

}

class Dog extends Animal{

    public Dog() {
        super.getName();
        System.out.println("Dog Called");
    }

    public void callDog(){
        System.out.println("Call Dog");
    }
}
