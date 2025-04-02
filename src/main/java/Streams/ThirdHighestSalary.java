package Streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class ThirdHighestSalary {

    public static void main(String[] args) {

        List<Employee> employeeList= Arrays.asList(
                new Employee("James",23,"developer",35000.00,2,false,"Las Vegas","male"),
                new Employee("Albert",25,"senior developer",75000.00,2,true,"London","male"),
                new Employee("Micheal",34,"Testing advisor",65000.00,2,false,"New York","male"),
                new Employee("Charles",39,"Architect",95000.00,2,true,"Germany","female"),
                new Employee("Scott",28,"Coding team",55000.00,2,false,"California","male"),
                new Employee("Pineda",45,"Team lead",75000.00,2,true,"Canada","female"),
                new Employee("Morgon",29,"HR",95000.00,2,false,"Chennai","female")
        );

        double max=employeeList.stream().mapToDouble(Employee::getSalary).distinct().boxed().sorted(Comparator.reverseOrder()).skip(1).findFirst().get();
        System.out.println(max);

        List<Employee> secondHighestSalary=employeeList.stream().filter(employee -> employee.getSalary()==max).toList();
        System.out.println(secondHighestSalary);


    }
}
