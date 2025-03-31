package Streams;

import java.util.stream.Collectors;

public class SpecialCharacters {

    public static void main(String[] args) {

        String str="Hello@!World#$";

        String specialCharacters=str.chars().filter(Character::isAlphabetic).mapToObj(value -> String.valueOf((char) value)).collect(Collectors.joining());
        System.out.println(specialCharacters);
    }
}
