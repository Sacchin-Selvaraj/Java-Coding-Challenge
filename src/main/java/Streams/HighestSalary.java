package Streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class HighestSalary {

    public static void main(String[] args) {

        Employee employee1=new Employee();

        List<Employee> employeeList = employee1.getEmployees();

        Employee employee=employeeList.stream().max(Comparator.comparing(Employee::getSalary)).get();
        System.out.println(employee);

        List<Employee> secondHighest= employeeList.stream().max(Comparator.comparing(Employee::getSalary)).stream().toList();
    }
}
