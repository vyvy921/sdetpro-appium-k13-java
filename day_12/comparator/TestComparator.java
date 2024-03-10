package day_12.comparator;

import java.util.Arrays;
import java.util.List;

public class TestComparator {

    public static void main(String[] args) {

        Employee e1 = new Employee("Lan", 18, 23.33F);
        Employee e2 = new Employee("Yen", 30, 70.777F);
        Employee e3 = new Employee("Minh", 28, 28.888F);
        Employee e4 = new Employee("Binh", 30, 55.555F);

        List<Employee> employeeList = Arrays.asList(e1, e2, e3, e4);
        System.out.println("BEFORE sorting");
        System.out.println(employeeList);

        employeeList.sort(new EmployeeComparatorAge());
        System.out.println("AFTER sorting by Age");
        System.out.println(employeeList);

        employeeList.sort(new EmployeeComparatorName());
        System.out.println("AFTER sorting by Name");
        System.out.println(employeeList);


    }
}
