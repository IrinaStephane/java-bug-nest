package employee_management;

public class FullTimeEmployee extends Employee {
    private double monthlySalary;

    public FullTimeEmployee(int employeeId, String name, double monthlySalary) {
        super(employeeId, name);
        setMonthlySalary(monthlySalary);
    }

    public FullTimeEmployee(String name, double monthlySalary) {
        super(name);
        setMonthlySalary(monthlySalary);
    }

    public double getMonthlySalary() {
        return monthlySalary;
    }

    public void setMonthlySalary(double monthlySalary) {
        if (monthlySalary < 0) {
            throw new IllegalArgumentException("Salaire invalide");
        }
        this.monthlySalary = monthlySalary;
    }

    @Override
    public double calculatePay() {
        return monthlySalary;
    }

    @Override
    public double calculateTax() {
        return 0.20 * monthlySalary;
    }

    @Override
    public String getDetailsForHR() {
        return "Full time employee: " + getEmployeeId() + " " + getName() + " " + monthlySalary + " " + calculateTax();
    }
}
