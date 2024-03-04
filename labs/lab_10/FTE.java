package labs.lab_10;

public class FTE extends Employee_Abs {
    private String name;

    public FTE() {
        this.setSalary(50000);
    }

    @Override
    public void setSalary(int salary) {
        this.salary = salary;
    }

    public void sayHello() {
        String greetingStr = generateGreetingPrefix() + "child";
    }

}
