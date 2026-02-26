package Contest;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class SortEmployee {

    public static void main(String[] args) {
        List<Employee> empList= new ArrayList<>(List.of(new Employee(1, "Sacchin", 36000),
                new Employee(2, "Rohan", 30000), new Employee(3, "Mani", 32000),
                new Employee(4, "Riswanth", 38000), new Employee(5, "Rohan", 35000)
        ));

        empList.sort(Comparator.comparing(Employee::getDepartment).thenComparing(Comparator.comparingInt(Employee::getId).reversed()));

        System.out.println(empList);
    }
}

class Employee {
    public int id;
    public String department;
    public double salary;

    public Employee(int id,String department, double salary){
        this.id=id;
        this.department=department;
        this.salary=salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", department='" + department + '\'' +
                ", salary=" + salary +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
