
package myconcrete;

public class HourlyEmployee extends Employee {
    //Variable
    private double hourlyWage;

    public HourlyEmployee(double hourlyWage, String employeeName, String employeeNumber, String hireDate) {
        super(employeeName, employeeNumber, hireDate);
        this.hourlyWage = hourlyWage;
    }

    public HourlyEmployee(double hourlyWage, String employeeName, String employeeNumber) {
        super(employeeName, employeeNumber);
        this.hourlyWage = hourlyWage;
    }

    public HourlyEmployee(double hourlyWage) {
        this.hourlyWage = hourlyWage;
    }

    public double getHourlyWage() {
        return hourlyWage;
    }

    public void setHourlyWage(double hourlyWage) {
        this.hourlyWage = hourlyWage;
    }

    @Override
    //The getEmployeeName shows the inheritance
    public String toString() {
        return "HourlyEmployee{" + "hourlyWage=" + hourlyWage + "Name=" + getEmployeeName() +'}';
    }
    
}
