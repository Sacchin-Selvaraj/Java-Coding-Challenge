package CommonQuestions;

public class defaultInterface {
    public static void main(String[] args) {
        Dogs dog=new Dogs();
        dog.display();
        dog.show();
        Animals.shows();
    }
}
interface Animals{
    default void show(){
        System.out.println("hello world");
    }
    void display();
    static void shows(){
        System.out.println("static method");
    }
}

class Dogs implements Animals{

    @Override
    public void display() {
        System.out.println("Hello Im Dog");
    }

}
