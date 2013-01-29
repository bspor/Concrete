
package myconcrete;

public class SalaryBonusEmployee extends SalariedEmployee {
    private double bonus;

    public SalaryBonusEmployee(double bonus, double salary) {
        super(salary);
        this.bonus = 300.00;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    } 

    //Going to mix it up and have it pull the employee number this time
    //However, if the number is invalid it will be blank
    /**
     *
     * @return
     */
    @Override
    public String toString() {
        return "SalaryBonusEmployee{" + "bonus=" + bonus + "EmployeeNumber=" + 
                getEmployeeNumber() +'}';
    }
}
