package employee_management;

import java.util.Objects;

public abstract class Employee {
    private static int lastId = 0;
    private final int employeeId;
    private String name;

    public Employee(String name) {
        this.employeeId = ++lastId;
        this.name = name;
    }

    public Employee(int employeeId, String name) {
        this.employeeId = employeeId;
        this.name = name;
        if (employeeId > lastId) {
            lastId = employeeId;
        }
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public abstract double calculatePay();
    public abstract double calculateTax();

    @Override
    public String toString() {
        return "EmployeeId : " + employeeId + " Name : " + name;
    }

    public abstract String getDetailsForHR();

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return employeeId == employee.employeeId && Objects.equals(name, employee.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(employeeId, name);
    }
}
