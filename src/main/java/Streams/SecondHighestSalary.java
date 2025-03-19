package Streams;

import java.util.*;

public class SecondHighestSalary {

    public static void main(String[] args) {
        List<Employee> employeeList= Arrays.asList(
                new Employee("James",23,"developer",35000.00,2,false,"Las Vegas"),
                new Employee("Albert",25,"senior developer",75000.00,2,true,"London"),
                new Employee("Micheal",34,"Testing advisor",65000.00,2,false,"New York"),
                new Employee("Charles",39,"Architect",95000.00,2,true,"Germany"),
                new Employee("Scott",28,"Coding team",55000.00,2,false,"California"),
                new Employee("Pineda",45,"Team lead",75000.00,2,true,"Canada"),
                new Employee("Morgon",29,"HR",65000.00,2,false,"Chennai")
        );

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



    }
}
