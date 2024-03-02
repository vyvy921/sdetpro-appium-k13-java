package day_10_2;

public class Employee {
    protected int salary;
    protected int supportSalary;

    public Employee(int salary) {
        this.salary = salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getSalary() {
        return salary;
    }

    public int getSupportSalary() {
        return supportSalary;
    }
}
