package Streams;

import java.util.*;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.stream.Collectors;

public class EmployeeDepartmentSalary {

    public static void main(String[] args) {
       Employee employee = new Employee();
       List<Employee> employeeList = employee.getEmployees();

        Map<String, Employee> employeeMap = employeeList.stream()
                .collect(Collectors.toMap(Employee::getRole,
                        Function.identity(),
                        BinaryOperator.maxBy(Comparator.comparingDouble(Employee::getSalary))));

        employeeMap.forEach((a,b)-> System.out.println(a + " --> "+ b.name));

    }
}
