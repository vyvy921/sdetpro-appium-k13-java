package labs.lab_10;

public class ConstractEmployee extends Employee_Abs {

    public ConstractEmployee() {
        this.setSalary(40000);
    }

    @Override
    public void setSalary(int salary) {
        this.salary = salary;
    }
}
