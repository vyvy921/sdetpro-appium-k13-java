package labs.lab_10;

import labs.lab_7_1_fixed.Employee;

import java.util.Arrays;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        Employee_Abs fte1 = new FTE();
        Employee_Abs fte2 = new FTE();
        Employee_Abs fte3 = new FTE();

        Employee_Abs ct1 = new ConstractEmployee();
        Employee_Abs ct2 = new ConstractEmployee();

        List<Employee_Abs> employeeList = Arrays.asList(fte1, fte2, fte3, ct1, ct2);

        System.out.println(Controller.totalSalary(employeeList));

        fte3.setSalary(0);
        System.out.println(Controller.totalSalary(employeeList));
    }
}
