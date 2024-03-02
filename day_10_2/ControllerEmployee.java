package day_10_2;

import java.util.List;

public class ControllerEmployee {

    public static int sumSalary(List<Employee> employeeList) {

        int sum = 0;
        for (Employee employee : employeeList)
            sum += employee.getSalary() + employee.getSupportSalary();

        return sum;
    }
}
