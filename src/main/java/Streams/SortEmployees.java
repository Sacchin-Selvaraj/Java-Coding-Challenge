package Streams;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class SortEmployees {
    public static void main(String[] args) {
//        Employee employee=new Employee();
//
//        List<Employee> employeeList=employee.getEmployees();
//
//        System.out.println(employeeList);
//
//        List<Employee> employeeListAfterSort=employeeList
//                .stream()
//                .sorted(Comparator.comparingDouble(Employee::getSalary).reversed())
//                .toList();
//
//        System.out.println("----------- After Sorting ----------");
//        System.out.println(employeeListAfterSort);
//
//        Double totalSalary = employeeList.stream().map(employee1 -> employee1.salary)
//                .reduce(Double::sum).orElse(0D);
//
//        System.out.println(totalSalary);
//
//        int[] arr={1,2,3,4,5};
//
//        Integer[] sqrt =  Arrays.stream(arr).boxed().map(t-> t*t*t)
//                .toArray(Integer[]::new);
//
//        List<Integer> list=List.of(6,1,5,2,4,3);
//
//        List<Integer> reversedList = list.stream().sorted(Comparator.reverseOrder()).toList();
//
//        System.out.println(reversedList);
//
//        List<String> strList=List.of("Kiwi","Apple","Mango", "PineApple","Grapes", "Lemon");
//
//        List<String> sortedList = strList.stream().sorted().toList();
//
//        System.out.println(sortedList);

        List<String> list4=List.of("Kiwi","Apple","Mango", "PineApple","Grapes", "Lemon");

        Map<String,Integer> integerMap = list4.stream()
                .collect(Collectors.toMap(s -> s, String::length))
                .entrySet()
                .stream()
                .sorted((o1, o2) -> o2.getValue()-o1.getValue())
                .collect(Collectors.toMap(
                        Map.Entry::getKey,
                        Map.Entry::getValue,
                        (integer, integer2) -> integer,
                        LinkedHashMap::new
                ));

        System.out.println(integerMap);

        Map<Character,Integer> map1=Map.of('a',1,'b',2,'c',3,'d',4);

    }

}
