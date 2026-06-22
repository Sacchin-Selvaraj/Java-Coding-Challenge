package Streams;

import java.util.Comparator;
import java.util.Map;
import java.util.stream.Collectors;


public class EmployeeDepartment {

    public static void main(String[] args) {

        Map<String,Employee> map = Employee.getEmployees()
                        .stream().collect(Collectors.groupingBy(Employee::getRole,
                        Collectors.collectingAndThen(
                                Collectors.toList(),list-> list
                                .stream()
                                .sorted(Comparator.comparingDouble(Employee::getSalary).reversed().thenComparing(Employee::getName))
                                .limit(1)
                                .findFirst()
                                .get()

                )));


        System.out.println(map);



    }
}
