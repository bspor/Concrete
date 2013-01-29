
package myconcrete;

import java.util.Scanner;

public class MyConcrete {

    public static void main(String[] args) {
        //Variables
        String employeeName;
        String employeeNumber;
        String hireDate;
        double payRate;
        
        //Create scanner object
        Scanner keyboard = new Scanner(System.in);
        
        //Get employee information from user
        System.out.println("Enter employee name:");
        employeeName = keyboard.nextLine();
        
        System.out.println("Enter employee number:");
        employeeNumber = keyboard.nextLine();
        
        System.out.println("Enter employee date of hire:");
        hireDate = keyboard.nextLine();
        
        System.out.println("Enter employee pay rate:");
        payRate = keyboard.nextDouble();
        
        //Both salary, hourly and bonus will be the same since I am using the same
        //as they all accept the same data type and I am using only 1 input
        
        //create object for demonstration
        HourlyEmployee he = new HourlyEmployee(payRate, employeeName, employeeNumber, hireDate);
        
        //Output the wage which is the only method in HourlyEmployee and then shows the name which is inherited from Employee
        System.out.println(he);
        
        //create object for demonstration
        SalariedEmployee se = new SalariedEmployee(payRate, employeeName, employeeNumber, hireDate);
        
        //Output the Salary which is the only method in SalariedEmployee and then shows the name which is inherited from Employee
        System.out.println(se);
        
        
        //Even though I set bonus to 0 here it will be over-ridden 
        double bonus = 0;
        
        //create object for demonstration
        SalaryBonusEmployee sbe = new SalaryBonusEmployee(payRate, bonus);
        
        //Output the Salary which is the only method in SalariedEmployee and then shows the number which is inherited from Employee
        System.out.println(sbe);
    }
}
