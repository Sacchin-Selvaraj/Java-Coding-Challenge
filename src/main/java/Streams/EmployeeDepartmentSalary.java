package Streams;

import java.util.*;
import java.util.stream.Collectors;

public class EmployeeDepartmentSalary {

    public static void main(String[] args) {
       Employee employee = new Employee();
       List<Employee> employeeList = employee.getEmployees();

        Map<String, List<Employee>> employeeMap = employeeList.stream()
                .collect(Collectors.groupingBy(Employee::getRole,
                        Collectors.collectingAndThen(
                        Collectors.toList(),
                        list-> list
                                .stream()
                                .sorted((o1, o2) -> (int) (o2.salary-o1.salary)).limit(2)
                                .collect(Collectors.toList())
                        )
                        ));

        employeeMap.forEach((a,b)-> System.out.println(a + " --> "+ b));


        Map<Integer,Employee> employeeMap1 = employeeList.stream()
                .collect(Collectors.groupingBy(Employee::getAge,
                        Collectors.collectingAndThen(
                                Collectors.toList(),
                                employees3 -> employees3.stream()
                                        .sorted((o1, o2) -> (int) (o2.salary-o1.salary))
                                        .limit(1)
                                        .findFirst().get())
                        ));

        employeeMap1.forEach(
                (integer, employee1) -> System.out.println("Age: "+integer+ " Employee: "+employee1)
        );
    }
}
