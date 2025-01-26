package Java_Program;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriting {

    public static void main(String[] args) {

        try {
            FileWriter file = new FileWriter("Output2.txt",true);
            BufferedWriter bf = new BufferedWriter(file);
            bf.write("Im Sacchin");
            bf.newLine();
            bf.write("qwerty");
            System.out.println("Success");
            bf.close();
        }catch (Exception e){
            System.out.println(e.getMessage());
        }

    }
}
