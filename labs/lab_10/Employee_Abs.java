package labs.lab_10;

public abstract class Employee_Abs {

    protected int salary;
    public int getSalary() {
        return salary;
    }

    //Delegate implementations for concrete classes
    public abstract void setSalary(int salary);

    protected String generateGreetingPrefix(){
        return "Hello ";
    }
}
