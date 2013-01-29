
package myconcrete;

public class SalariedEmployee extends Employee {
    private double salary;

    public SalariedEmployee(double salary, String employeeName, String employeeNumber, String hireDate) {
        super(employeeName, employeeNumber, hireDate);
        this.salary = salary;
    }

    public SalariedEmployee(double salary, String employeeName, String employeeNumber) {
        super(employeeName, employeeNumber);
        this.salary = salary;
    }

    public SalariedEmployee(double salary) {
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "SalariedEmployee{" + "salary=" + salary + "Name=" + getEmployeeName() +'}';
    }  
}
