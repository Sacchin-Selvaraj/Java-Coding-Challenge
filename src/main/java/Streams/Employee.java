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

    public Employee(String name, int age, String role, double salary, int exp, boolean leave_balance, String location, String gender) {
        this.name = name;
        this.age = age;
        this.role = role;
        this.salary = salary;
        this.exp = exp;
        this.leave_balance = leave_balance;
        this.location = location;
        this.gender = gender;
    }

    public Employee() {
    }

    public List<Employee> getEmployees(){
        return List.of(new Employee("Sacchin",24,"Software Engineer", 80000,3,false,"chennai","male"),
                new Employee("Ramesh",45,"Mechanical Engineer", 40000,3,false,"coimbatore","male"),
                new Employee("Suresh",34,"Mechanical Engineer", 30000,3,false,"coimbatore","male"),
                new Employee("Sehwag",23,"Design Engineer", 60000,3,false,"chennai","male"),
                new Employee("Siva",27,"Design Engineer", 63000,3,false,"chennai","male"),
                new Employee("Rohit",28,"Software Engineer", 80000,3,false,"germany","male"),
                new Employee("Mani",25,"Game Developer", 46700,3,false,"dindigal","male"),
                new Employee("Riswanth",29,"Software Engineer", 39000,3,false,"chennai","male"),
                new Employee("Rohan",24,"Game Developer", 78000,3,false,"chennai","male"),
                new Employee("Hemanath",31,"Software Engineer", 55000,3,false,"chennai","male")
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
