package Streams;

import java.util.List;

public class Employee {

    public String name;
    public int age;
    public String role;
    public double salary;
    public int exp;
    public boolean leave_balance;
    public String location;
    public String gender;
    public List<String> skills;

    public Employee(String name, int age, String role, double salary, int exp, boolean leave_balance, String location, String gender, List<String> skills) {
        this.name = name;
        this.age = age;
        this.role = role;
        this.salary = salary;
        this.exp = exp;
        this.leave_balance = leave_balance;
        this.location = location;
        this.gender = gender;
        this.skills = skills;
    }

    public Employee() {
    }

    public List<Employee> getEmployees(){
        return List.of(new Employee("Sacchin",24,"Software Engineer", 80000,3,false,"chennai","male",List.of("Java","Python","Docker","Kubernetes","Kafka","Git","Maven","Postman","SpringBoot","Spring Security")),
                new Employee("Ramesh",45,"Mechanical Engineer", 40000,3,false,"coimbatore","male",List.of("Python","Docker")),
                new Employee("Suresh",34,"Mechanical Engineer", 30000,3,false,"coimbatore","male",List.of("Kubernetes","Kafka")),
                new Employee("Sehwag",23,"Design Engineer", 60000,3,false,"chennai","male",List.of("Java","Kubernetes","Kafka")),
                new Employee("Siva",27,"Design Engineer", 63000,3,false,"chennai","male",List.of("Git","Maven","Postman","SpringBoot","Spring Security")),
                new Employee("Rohit",28,"Software Engineer", 80000,3,false,"germany","male",List.of("Designing")),
                new Employee("Mani",25,"Game Developer", 46700,3,false,"dindigal","male",List.of("CAD")),
                new Employee("Riswanth",29,"Software Engineer", 39000,3,false,"chennai","male",List.of("SpringBoot","Spring Security")),
                new Employee("Rohan",24,"Game Developer", 78000,3,false,"chennai","male",List.of("Java","Python","Kafka","Git","Maven","Spring Security")),
                new Employee("Hemanath",31,"Software Engineer", 55000,3,false,"chennai","male",List.of("Java","Docker","Kubernetes","Kafka","Git","Maven","Postman","SpringBoot","Spring Security"))
        );
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
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

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public int getExp() {
        return exp;
    }

    public void setExp(int exp) {
        this.exp = exp;
    }

    public boolean isLeave_balance() {
        return leave_balance;
    }

    public void setLeave_balance(boolean leave_balance) {
        this.leave_balance = leave_balance;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", role='" + role + '\'' +
                ", salary=" + salary +
                ", exp=" + exp +
                ", leave_balance=" + leave_balance +
                ", location='" + location + '\'' +
                '}';
    }
}
