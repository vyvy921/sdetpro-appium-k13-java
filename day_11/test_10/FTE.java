package day_11.test_10;

public class FTE extends Employee {
    public FTE() {
        this.salary = 50000;
    }

    public FTE(int salary, int supportSalary, String name) {
        super(salary, supportSalary, name);
    }

    @Override
    public void setSalary(int salary) {
        this.salary = salary;
    }

    public void sayHello() {
        String greetingStr = generateGreetingPrefix() + "child";
    }

}
