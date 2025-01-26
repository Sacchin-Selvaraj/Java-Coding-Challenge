package Java_Program;

import java.io.File;
import java.io.PrintStream;

public class ConsoleOutput {

    public static void main(String[] args) {

        try {
            File file = new File("Output2.txt");
            PrintStream pr = new PrintStream(file);
            System.setOut(pr);
            System.out.println("This is from Console output");
            pr.close();
            PrintStream d=new PrintStream(System.out);
            System.setOut(d);
            System.out.println("Success");
        }catch (Exception e){
            System.out.println(e.getMessage());
        }

        System.out.println("Hello!!!");
    }
}
