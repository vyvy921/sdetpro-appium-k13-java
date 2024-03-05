package day_11.test_10;

public abstract class Employee {

    protected int salary;
    protected int supportSalary;
    protected String name;

    public Employee() {

    }

    public Employee(int salary, int supportSalary, String name) {
        this.salary = salary;
        this.supportSalary = supportSalary;
        this.name = name;
    }

    public int getSalary() {
        return salary;
    }

    //Delegate implementations for concrete classes
    public abstract void setSalary(int salary);

    protected String generateGreetingPrefix(){
        return "Hello ";
    }
}
