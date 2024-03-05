package day_11.test_10;

import java.util.List;

public class Controller {

    public static int totalSalary(List<Employee> employeeList) {
        //Handle exception, validation data
        // null, empty,...
        int total = 0;

        for (Employee employee : employeeList)
            total += employee.getSalary();

        return total;
    }
}
