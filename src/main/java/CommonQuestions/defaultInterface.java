package CommonQuestions;

public class defaultInterface {
    public static void main(String[] args) {
        Dogs dog=new Dogs();
        dog.display();
        dog.show();
    }
}
interface Animals{
    default void show(){
        System.out.println("hello world");
    }
    void display();
}

class Dogs implements Animals{

    @Override
    public void display() {
        System.out.println("Hello Im Dog");
    }

}
