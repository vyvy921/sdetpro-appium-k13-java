package day_11.test_10;

public class ConstractEmployee extends Employee {

    public ConstractEmployee() {
        this.setSalary(40000);
    }

    @Override
    public void setSalary(int salary) {
        this.salary = salary;
    }
}
