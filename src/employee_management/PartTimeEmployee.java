package employee_management;

public class PartTimeEmployee extends Employee {
    private double hoursWorked;
    private double hourlyRate;

    public PartTimeEmployee(int employeeId, String name, double hoursWorked, double hourlyRate) {
        super(employeeId, name);
        setHoursWorked(hoursWorked);
        setHourlyRate(hourlyRate);
    }

    public PartTimeEmployee(String name, double hoursWorked, double hourlyRate) {
        super(name);
        setHoursWorked(hoursWorked);
        setHourlyRate(hourlyRate);
    }

    public double getHoursWorked() {
        return hoursWorked;
    }

    public void setHoursWorked(double hoursWorked) {
        if (hoursWorked < 0) throw new IllegalArgumentException("Heures invalides");
        this.hoursWorked = hoursWorked;
    }

    public double getHourlyRate() {
        return hourlyRate;
    }

    public void setHourlyRate(double hourlyRate) {
        if (hourlyRate < 0){
            throw new IllegalArgumentException("Taux horaire invalide");
        }
        this.hourlyRate = hourlyRate;
    }

    @Override
    public double calculatePay() {
        return hoursWorked * hourlyRate;
    }

    @Override
    public double calculateTax() {
        return 0.15 * hoursWorked * hourlyRate;
    }

    @Override
    public String getDetailsForHR() {
        return "Part time employee: ID: " + getEmployeeId() + ", Name: " + getName() + ", Hourly Rate: " +hourlyRate+ ", Hours Worked: " + hoursWorked + " Tax: " + calculateTax();
    }
}
