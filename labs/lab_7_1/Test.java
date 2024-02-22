package labs.lab_7_1;

import java.util.Arrays;
import java.util.List;

public class Test {

    public static void main(String[] args) {
        Employee fte1 = new FulltimeEmployee();
        Employee fte2 = new FulltimeEmployee();
        Employee fte3 = new FulltimeEmployee(); //15 + 8 = 23

        Employee ce1 = new ConstractEmplyee();
        Employee ce2 = new ConstractEmplyee();

        List<Employee> employeeList = Arrays.asList(fte1, fte2, fte3, ce1, ce2);

        int totalSalary = ControllerEmployee.sumSalary(employeeList);
        System.out.printf("Total salary: %d", totalSalary);

    }
}
