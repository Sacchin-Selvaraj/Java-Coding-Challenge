package Arrays;

import java.util.*;

public class AbstractClassJava {

    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.getName();



        System.out.println(dog.getNumber());
    }
}

class Animal{

    public Animal() {
        System.out.println("Animal Called");
    }

    void getName(){
        System.out.println("Animal Name called");
    }

    public int getNumber(){

        TreeMap<Integer,String> map=new TreeMap<>();

        map.entrySet().stream().sorted(Map.Entry.comparingByValue())
                .collect(LinkedHashMap::new,
                        (m, e) -> m.put(e.getKey(), e.getValue()),
                        LinkedHashMap::putAll
                );

        try {
            System.out.println("Inside Try Block");
            int num=5/0;
            return 3;
        }catch (Throwable t){
            System.out.println("Inside Catch Block");
            return 5;
        }
        finally {
            System.out.println("Inside Finally Block");
            return 7;
        }


    }

}

class Dog extends Animal{

    public Dog() {
        super.getName();
        System.out.println("Dog Called");
    }

    public void callDog(){
        System.out.println("Call Dog");
    }

    public static String reverseByType(String s) {
        Stack<Character> chars=new Stack<>();
        Stack<Character> spcChars=new Stack<>();

        for(char c:s.toCharArray()){
            if(Character.isAlphabetic(c)){
                chars.push(c);
            }else{
                spcChars.push(c);
            }
        }
        char[] arr=s.toCharArray();
        for(int i=0;i<s.length();i++){
            if(Character.isAlphabetic(s.charAt(i))){
                arr[i]=chars.pop();
            }else{
                arr[i]=spcChars.pop();
            }
        }

        return new String(arr);

    }
}
