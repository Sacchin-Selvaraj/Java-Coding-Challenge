package Streams;

import java.util.Comparator;
import java.util.List;

public class SortEmployees {
    public static void main(String[] args) {
        Employee employee=new Employee();

        List<Employee> employeeList=employee.getEmployees();

        System.out.println(employeeList);

        List<Employee> employeeListAfterSort=employeeList
                .stream()
                .sorted(Comparator.comparingDouble(Employee::getSalary).reversed())
                .toList();

        System.out.println("----------- After Sorting ----------");
        System.out.println(employeeListAfterSort);

        Double totalSalary = employeeList.stream().map(employee1 -> employee1.salary)
                .reduce(Double::sum).orElse(0D);

        System.out.println(totalSalary);
    }

}
