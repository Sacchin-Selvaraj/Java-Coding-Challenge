package Java_Program;

import java.util.ArrayList;
import java.util.List;

abstract class Computers {
   abstract void turnOn();
}

interface Dell {
    void display();
}


public class GFG  {

    public static void main(String[] args)
    {
        int number = 2;
        List<Integer> list=new ArrayList<>();


        // 2 bit left shift operation
        int Ans = number << 1;

        System.out.println(Ans);


    }

    public static class Hello extends Computers{


        @Override
        void turnOn() {

        }
    }
}
