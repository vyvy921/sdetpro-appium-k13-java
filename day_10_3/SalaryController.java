package day_10_3;

import java.util.List;

public class SalaryController {

    public static int totalSalary(List<Employee> employeeList) {
        int total = 0;

        for (Employee employee : employeeList)
            total += employee.getSalary() + employee.getSupportSalary();

        return total;
    }
}
