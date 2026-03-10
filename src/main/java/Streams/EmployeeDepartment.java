package Streams;

import java.util.Map;
import java.util.stream.Collectors;

public class EmployeeDepartment {
    public static void main(String[] args) {

        Employee employee=new Employee();

        Map<String,Long> map=employee.getEmployees().stream().collect(Collectors.groupingBy(Employee::getRole,Collectors.counting()));

        System.out.println(map);
    }
}
