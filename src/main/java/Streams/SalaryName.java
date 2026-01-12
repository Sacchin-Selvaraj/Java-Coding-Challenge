package Streams;

import java.util.Comparator;
import java.util.List;

public class SalaryName {

    public static void main(String[] args) {
        Employee employee=new Employee();

        List<Employee> employeeList = employee.getEmployees();

        List<Employee> employeeListSorted = employeeList.stream()
                .sorted(Comparator.comparingDouble(Employee::getSalary)
                        .reversed()
                        .thenComparing(employee1 -> employee1.name.toLowerCase()))
                .toList();

        employeeListSorted.forEach(employee1 -> System.out.println("\n"+employee1));
    }
}
