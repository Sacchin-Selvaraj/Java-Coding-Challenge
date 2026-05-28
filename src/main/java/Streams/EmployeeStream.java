package Streams;


import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class EmployeeStream {

    public static void main(String[] args) {

        List<EmployeeRecord> employeeRecords = List.of(
                new EmployeeRecord("Sacchin",1,"Java",80000.00),
                new EmployeeRecord("Mani",2,"PlayWright",60000.00),
                new EmployeeRecord("Riswanth",3,"PlayWright",70000.00),
                new EmployeeRecord("Dhanush",4,"JavaScript",50000.00),
                new EmployeeRecord("Rohan",5,"JavaScript",680000.00)
                );

        Map<String,List<EmployeeRecord>> map = employeeRecords.stream()
                .collect(Collectors.groupingBy(EmployeeRecord::department));

        System.out.println(map);

        Set<Integer> set = Stream.iterate(1, i -> i+10).limit(10).collect(Collectors.toSet());

        System.out.println(set);

        List<Integer> list = IntStream.range(0,101).filter(n-> n>=80).boxed().toList();

        System.out.println(list);

        List<Integer> list2 = List.of(1,1,1,2,2,3,4,4,5,5,5);

        Map<Integer,Long> res = list2.stream()
                .collect(Collectors.groupingBy(n->n,
                        Collectors.counting()));

        System.out.println(res);

        Map<Integer,Long> result = res.entrySet().stream()
                .sorted(Comparator.comparingInt(Map.Entry::getKey))
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue,(o, o2) -> o,
                        LinkedHashMap::new));

        System.out.println(result);

       Thread t1 = new Thread();

       
    }
}
