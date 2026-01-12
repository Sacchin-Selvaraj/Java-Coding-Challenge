package Streams;

import java.util.*;
import java.util.stream.Collectors;

public class SecondHighestSalary {

    public static void main(String[] args) {
        Employee employee5=new Employee();

        List<Employee> employeeList = employee5.getEmployees();

        List<Employee> employee=employeeList.stream().filter(employee1 -> employee1.name.startsWith("A")).toList();
        System.out.println(employee);

        Optional<Employee> employee1=employeeList.stream().sorted(
                Comparator.comparingDouble(Employee::getSalary).reversed()).skip(1).findFirst();

        System.out.println(employee1.get().salary);

        List<Employee> employee3=employeeList.stream().filter(employee2 -> !employee2.leave_balance ).toList();
        System.out.println(employee3);

        List<Employee> employeeList1=employeeList.stream().sorted((o1, o2)-> (int) (o1.getSalary()- o2.getSalary())).toList();
        System.out.println(employeeList1);

        List<Employee> employeeList2=employeeList.stream().sorted(Comparator.comparingDouble(Employee::getSalary)).toList();
        System.out.println(employeeList2);

        List<Employee> employeeList3=employeeList.stream().sorted(Comparator.comparing(Employee::getAge).reversed()).toList();
        System.out.println(employeeList3);

        Map<String,List<Employee>> group=employeeList.stream().collect(Collectors.groupingBy(Employee::getLocation));
        System.out.println("group"+group);

        group.forEach((s, employees) -> System.out.println(s+" - "+employees));

        Double salary= employeeList.stream().max(Comparator.comparing(Employee::getSalary)).get().salary;
        System.out.println(salary);


    }
}
