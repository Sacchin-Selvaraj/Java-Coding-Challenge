package Streams;


import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class EmployeeStream {

    public static void main(String[] args) {

        List<EmployeeRecord> employeeRecords = List.of(new EmployeeRecord("Sacchin",1,"Java",80000.00),
                new EmployeeRecord("Mani",2,"PlayWright",60000.00),
                new EmployeeRecord("Riswanth",3,"PlayWright",70000.00),
                new EmployeeRecord("Dhanush",4,"JavaScript",50000.00),
                new EmployeeRecord("Rohan",5,"JavaScript",680000.00)
                );

        Map<String,List<EmployeeRecord>> map = employeeRecords.stream()
                .collect(Collectors.groupingBy(EmployeeRecord::department));

        System.out.println(map);
    }
}
