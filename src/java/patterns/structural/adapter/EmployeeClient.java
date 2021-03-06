package patterns.structural.adapter;

import java.util.ArrayList;
import java.util.List;

public class EmployeeClient {
    public List<Employee> getEmployeeList() {
        List<Employee> employees = new ArrayList<>();

        Employee employeeFromDb = new EmployeeDB("1234", "John", "Wick", "john@wick.com");
        employees.add(employeeFromDb);

        //Will not work! This is where the adapter comes into play!
        //Employee employeeFromLdap = new EmployeeLdap("chewie", "Solo", "Han", "han@solo.com");

        EmployeeLdap employeeFromLdap = new EmployeeLdap("chewie", "Solo", "Han", "han@solo.com");
        employees.add(new EmployeeAdapterLdap(employeeFromLdap));

        EmployeeCsv employeeCsv = new EmployeeCsv("567,Sherlock,Holmes,sherlock@holmes.com");
        employees.add(new EmployeeAdapterCsv(employeeCsv));
        return employees;
    }
}
