//package Streams;
//
//import java.util.Arrays;
//import java.util.Comparator;
//import java.util.List;
//import java.util.Optional;
//
//public class SecondHighestSalary{
//
//    public static void main(String[] args) {
//
//        List<Employee> employeeList= Arrays.asList(
//                new Employee("James",23,"developer",35000.00,2,false,"Las Vegas"),
//                new Employee("Albert",25,"senior developer",75000.00,2,true,"London"),
//                new Employee("Micheal",34,"Testing advisor",65000.00,2,false,"New York"),
//                new Employee("Charles",39,"Architect",95000.00,2,true,"Germany"),
//                new Employee("Scott",28,"Coding team",55000.00,2,false,"California"),
//                new Employee("Pineda",45,"Team lead",75000.00,2,true,"Canada"),
//                new Employee("Morgon",29,"HR",65000.00,2,false,"Chennai")
//        );
//
//        Optional<Employee> salary=employeeList.stream().sorted(Comparator.comparingDouble(Employee::getSalary).reversed()).skip(1).findFirst();
//
//        salary.ifPresent(employee -> System.out.println(employee.salary));
//    }
//}
