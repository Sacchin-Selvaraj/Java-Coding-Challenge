package Java_Program;

class A{

    public A() {
        System.out.println("Hi");
    }

    private void kite(){
        System.out.println("hello");
    }
}

class B extends A{

    public B() {
        super();
    }

    public static void kite(){

        System.out.println("hello world");
    }
    public static void ball(){

    }

}


public class StaticHandsOn {

    public static void main(String[] args) {

        B obj=new B();
        obj.kite();
    }
}
