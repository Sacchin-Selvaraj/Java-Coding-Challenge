package CommonQuestions;

public class SuperKeyword {

    public static void main(String[] args) {
        Dog dog=new Dog();
        dog.show();
    }
}
class Animal{
  void display(){
      System.out.println("Animal Class");
  }
}
class Dog extends Animal{

    void show(){
        System.out.println("In dog Class");
        display();
    }

    @Override
    void display() {
        System.out.println("In Dog Class display method");
    }
}

