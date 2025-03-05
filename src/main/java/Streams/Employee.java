package Streams;

public class Employee {

    public String name;
    public int age;
    public String role;
    public double salary;
    public int exp;
    public boolean leave_balance;
    public String location;

    public Employee(String name, int age, String role, double salary, int exp, boolean leave_balance, String location) {
        this.name = name;
        this.age = age;
        this.role = role;
        this.salary = salary;
        this.exp = exp;
        this.leave_balance = leave_balance;
        this.location = location;
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
}
