package day_12.comparable;

import java.util.Comparator;

public class EmployeeAgeComparator implements Comparator<Employee> {

    @Override
    public int compare(Employee thisEmp, Employee thatEmp) {
        return thisEmp.getAge() - thatEmp.getAge();
    }


}
