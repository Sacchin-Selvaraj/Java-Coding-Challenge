package Streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class ThirdHighestSalary {

    public static void main(String[] args) {

        Employee employee7=new Employee();

        List<Employee> employeeList = employee7.getEmployees();

        double max=employeeList.stream().mapToDouble(Employee::getSalary).distinct().boxed().sorted(Comparator.reverseOrder()).skip(1).findFirst().get();
        System.out.println(max);

        List<Employee> secondHighestSalary=employeeList.stream().filter(employee -> employee.getSalary()==max).toList();
        System.out.println(secondHighestSalary);

        List<Employee> sortedBySalary=employeeList.stream().sorted(Comparator.comparingDouble(Employee::getSalary).reversed()).toList();
        System.out.println(sortedBySalary);

    }
}
