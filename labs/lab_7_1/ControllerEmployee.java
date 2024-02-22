package labs.lab_7_1;

import java.util.List;

public class ControllerEmployee {

    public static int sumSalary(List<Employee> employeeList) {

        int sum = 0;
        for (Employee employee : employeeList)
            sum += employee.getSalary();

        return sum;
    }
}
