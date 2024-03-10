package day_12.comparable;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class TestComparable {

    public static void main(String[] args) {
        Employee teo = new Employee("Teo", 20);
        Employee ti = new Employee("Ti", 30);
        Employee tun = new Employee("Tun", 10);

        List<Employee> employeeList = Arrays.asList(teo, ti, tun);
        System.out.println("BEFORE SORTING");
        System.out.println(employeeList);

        System.out.println("AFTER SORTING");
        Collections.sort(employeeList);
        System.out.println(employeeList);

    }
}
