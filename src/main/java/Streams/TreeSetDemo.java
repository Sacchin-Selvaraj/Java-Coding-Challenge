package Streams;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;


public class TreeSetDemo {
    public static void main(String[] args) {
        List<Employee> employeeList = Employee.getEmployees();

        Map<String,Long> departmentGroup = employeeList.stream()
                        .collect(Collectors.groupingBy(Employee::getRole,Collectors.counting()));

        System.out.println(departmentGroup);

    }
}
