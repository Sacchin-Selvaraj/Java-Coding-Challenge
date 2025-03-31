package Streams;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class FindMaleandFemale {

    public static void main(String[] args) {

        List<Employee> employeeList= Arrays.asList(
                new Employee("James",23,"developer",35000.00,2,false,"Las Vegas","male"),
                new Employee("Albert",25,"senior developer",75000.00,2,true,"London","male"),
                new Employee("Micheal",34,"Testing advisor",65000.00,2,false,"New York","male"),
                new Employee("Charles",39,"Architect",95000.00,2,true,"Germany","female"),
                new Employee("Scott",28,"Coding team",55000.00,2,false,"California","male"),
                new Employee("Pineda",45,"Team lead",75000.00,2,true,"Canada","female"),
                new Employee("Morgon",29,"HR",65000.00,2,false,"Chennai","female")
        );

        Map<String,List<Employee>> map=employeeList.stream().collect(Collectors.groupingBy(Employee::getGender));
        System.out.println(map);

        Map<String,Double> averageSalary=employeeList.stream().collect(Collectors.groupingBy(Employee::getGender,Collectors.averagingDouble(Employee::getSalary)));
        System.out.println(averageSalary);
    }
}
