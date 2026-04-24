package Java_Program;

public interface Hello {

    default void getName(){
        System.out.println("Sacchin");
    }

    static void getCurrentName(){
        System.out.println("Static method");
    }
}
