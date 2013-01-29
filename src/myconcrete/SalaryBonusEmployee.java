
package myconcrete;

public class SalaryBonusEmployee extends SalariedEmployee {
    private double bonus;

    public SalaryBonusEmployee(double bonus, double salary) {
        super(salary);
        this.bonus = bonus;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    } 
}
