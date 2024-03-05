package day_11.test_10;

import java.util.Arrays;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        Employee fte1 = new FTE();
        Employee fte2 = new FTE();
        Employee fte3 = new FTE();

        Employee ct1 = new ConstractEmployee();
        Employee ct2 = new ConstractEmployee();

        List<Employee> employeeList = Arrays.asList(fte1, fte2, fte3, ct1, ct2);

        System.out.println(Controller.totalSalary(employeeList));

        fte3.setSalary(0);
        System.out.println(Controller.totalSalary(employeeList));
    }
}
