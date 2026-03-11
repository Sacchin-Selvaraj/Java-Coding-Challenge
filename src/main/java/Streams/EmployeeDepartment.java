package Streams;

import java.util.Comparator;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class EmployeeDepartment {
    public static void main(String[] args) {

        Employee employee=new Employee();

        Map<String, Optional<Employee>> map=employee.getEmployees().stream().collect(Collectors.groupingBy(Employee::getRole,Collectors.maxBy(Comparator.comparing(Employee::getSalary))));

        System.out.println(map);


    }
}
