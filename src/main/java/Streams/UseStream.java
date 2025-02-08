package Streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;



class employee{
    String name;
    int age;
    double salary;

    public employee(String name, int age, double salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}




public class UseStream {

    public static void main(String[] args) {

        List<employee> employees= List.of(
                new employee("Sacchin",24,30000.00),
                new employee("James",40,60000.00),
                new employee("Ronaldo",34,130000.00),
                new employee("Messi",35,120000.00),
                new employee("Neymar",31,90000.00));

       List<employee> employees1=employees.stream().sorted((e1, e2) ->e1.getSalary()<e2.getSalary()?1:-1 ).toList();

       for (employee emp:employees1){
           System.out.println(emp);
       }

        List<employee> sortedWords = employees.stream()
                .sorted(Comparator.comparingInt(e -> e.getName().length())).toList();

        System.out.println(sortedWords);



    }

}
