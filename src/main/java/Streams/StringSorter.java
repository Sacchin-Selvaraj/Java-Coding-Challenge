package Streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StringSorter {

    public static void main(String[] args) {
        List<String> words = Arrays.asList("apple", "banana", "kiwi", "orange", "grape");

        List<String> sortedWords = words.stream()
                .sorted(Comparator.comparingInt(String::length)) // Sort by length
                .collect(Collectors.toList());

        System.out.println(sortedWords); // Output: [kiwi, apple, grape, orange, banana]
    }
}