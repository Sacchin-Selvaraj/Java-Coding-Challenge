package Java_Program;

class A{

    public A() {
        System.out.println("Hi");
    }

    public static void kite(){
        System.out.println("hello");
    }
    public void ball(){

    }
}

class B extends A{

    public B() {
        super();
    }

}

public class StaticHandsOn {

    public static void main(String[] args) {

        B obj=new B();
        A.kite();
    }
}
