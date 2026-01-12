package Streams;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class FindMaleandFemale {

    public static void main(String[] args) {

        Employee employee=new Employee();

        List<Employee> employeeList = employee.getEmployees();

        Map<String,List<Employee>> map=employeeList.stream().collect(Collectors.groupingBy(Employee::getGender));
        System.out.println(map);

        Map<String,Double> averageSalary=employeeList.stream().collect(Collectors.groupingBy(Employee::getGender,Collectors.averagingDouble(Employee::getSalary)));
        System.out.println(averageSalary);
    }
}
