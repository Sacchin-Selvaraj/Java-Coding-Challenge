package Streams;

import java.util.Comparator;
import java.util.Optional;

public class SecondLargestSalary {
    public static void main(String[] args) {

        Optional<Double> secondHighestSalary = Employee.getEmployees()
                .stream()
                .map(Employee::getSalary)
                .distinct()
                .sorted(Comparator.reverseOrder())
                .skip(1)
                .findFirst();

        secondHighestSalary.ifPresent(System.out::println);
    }
}
