package Java_Program;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileReading {


    public static void main(String[] args) throws RuntimeException, IOException {

//        File file=new File("Java_Program/textfile.txt");
//        Scanner sc=new Scanner(file);
//
//        while (sc.hasNext()){
//            System.out.println(sc.next());
//        }

        FileReader file = new FileReader("E:\\New Text Document.txt");

        BufferedReader bf = new BufferedReader(file);

        while (bf.ready()) {
            System.out.println(bf.readLine());
        }
    }
}
