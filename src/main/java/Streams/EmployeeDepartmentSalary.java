package Streams;

import java.util.*;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.toList;

public class EmployeeDepartmentSalary {

    public static void main(String[] args) {
       Employee employee = new Employee();
       List<Employee> employeeList = employee.getEmployees();

        Map<String, List<Employee>> employeeMap = employeeList.stream()
                .collect(Collectors.groupingBy(Employee::getRole,
                        Collectors.collectingAndThen(
                        toList(),
                        list-> list
                                .stream()
                                .sorted((o1, o2) -> (int) (o2.salary-o1.salary)).limit(2)
                                .collect(toList())
                        )
                        ));

        employeeMap.forEach((a,b)-> System.out.println(a + " --> "+ b));


        Map<Integer,Employee> employeeMap1 = employeeList.stream()
                .collect(Collectors.groupingBy(Employee::getAge,
                        Collectors.collectingAndThen(
                                toList(),
                                employees3 -> employees3.stream()
                                        .sorted((o1, o2) -> (int) (o2.salary-o1.salary))
                                        .limit(1)
                                        .findFirst().get())
                        ));

        employeeMap1.forEach(
                (integer, employee1) -> System.out.println("Age: "+integer+ " Employee: "+employee1)
        );

        TreeSet<String> treeSet = employeeList.stream()
                        .flatMap(emp-> emp.skills.stream())
                        .collect(Collectors.toCollection(TreeSet::new));

      System.out.println("Skills\n");
      treeSet.forEach(System.out::println);

    }
}
