package Factory_Design_Pattern;

import java.util.Scanner;

public class MemoryClass {

    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);

        System.out.println("Provide the Memory Type : ");
        String type=scanner.next();

        Memory memory=MemoryFactory.getObject(type);

        if (memory==null){
            System.out.println("Invalid Type");
        }else {
            memory.setMemoryName("LDDR5x");
            System.out.println(memory.getMemoryName());
        }
    }
}
