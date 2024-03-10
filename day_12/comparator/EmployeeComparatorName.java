package day_12.comparator;

import java.util.Comparator;

public class EmployeeComparatorName implements Comparator<Employee> {
    @Override
    public int compare(Employee thisEmp, Employee thatEmp) {
        return thisEmp.getName().compareToIgnoreCase(thatEmp.getName());
    }
}
