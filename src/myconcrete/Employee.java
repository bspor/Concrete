
package myconcrete;
//Necroed a class from java ch9 to play with
public class Employee {
    //Variables
    private String employeeName;
    private String employeeNumber;
    private String hireDate;
    
    //Constructors possible
    public Employee(String employeeName, String employeeNumber, String hireDate) {
        this.employeeName = employeeName;
        setEmployeeNumber(employeeNumber);
        this.hireDate = hireDate;
    }
    
    public Employee(String employeeName, String employeeNumber) {
        this.employeeName = employeeName;
        setEmployeeNumber(employeeNumber);
    }
        
    public Employee () {
        employeeName = "";
        employeeNumber = "";
        hireDate = "";                
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public String getEmployeeNumber() {
        return employeeNumber;
    }

    public void setEmployeeNumber(String employeeNumber) {
        if (isValidEmpNum(employeeNumber))
        {
            this.employeeNumber = employeeNumber;
        } else {
            this.employeeNumber = "Invalid employee number entered.";
        }
    }

    //Make sure the employee number is a valid number
    public boolean isValidEmpNum(String e) {
    boolean isValid = true; 
	        int i = 0;
         
        // Test the length of the string
        if (e.length() != 5) {
            isValid = false;
        }
	         
	        // Test the first 3 characters for digits
	        while (isValid && i < 3)
	        {
                    
	            if (!Character.isDigit(e.charAt(i))) {
                        isValid = false;
                        
                    }
	            i++;
	        }
	         
	        // Test 4th character for hyphen
	        while (isValid && i < 4)
	        {
                    
	            if (e.charAt(i) != '-') {
                        isValid = false;
                    }
                    i++;
	        }
	         
	        // Test last character for letter
	        while (isValid && i < 5)
	        {
                    
	            if (!Character.isLetter(e.charAt(i))) {
                        isValid = false;
                    }
	            i++;
	        }
                
	        // Test if last character is an A through M
	        while (isValid && i < 6)
                    
	        { 
	            if (e.charAt(4) < 'A' || e.charAt(4) > 'M') {
                        isValid = false;
                    }
	            i++;
	        }
	        return isValid;
        }
    
    public String getHireDate() {
        return hireDate;
    }

    public void setHireDate(String hireDate) {
        this.hireDate = hireDate;
    }
}
