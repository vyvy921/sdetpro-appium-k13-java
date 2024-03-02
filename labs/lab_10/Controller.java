package labs.lab_10;

import java.util.List;

public class Controller {

    public static int totalSalary(List<Employee_Abs> employeeList) {

        int total = 0;

        for (Employee_Abs employee : employeeList)
            total += employee.getSalary();

        return total;
    }
}
