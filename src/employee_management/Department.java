package employee_management;

import java.util.ArrayList;
import java.util.List;

public class Department {
    private final String name;
    private List<Employee> employees = new ArrayList<>();

    public Department(String name, List<Employee> employees) {
        this.name = name;
        this.employees = employees;
    }

    public Department(String name) {
        this.name = name;
    } 

    public String getName() {
        return name;
    }

    public void addEmployee(Employee employee) {
        if (!employees.contains(employee)) {
            employees.add(employee);
        }
    }

    public void showEmployeeDetails() {
        for (Employee emp : employees) {
            System.out.println(emp);
        }
    }

    public void showDetailsForHR() {
        for (Employee emp : employees) {
            System.out.println(emp.getDetailsForHR());
        }
    }
}
