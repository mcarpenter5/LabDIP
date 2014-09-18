package dip.lab1;

import java.text.NumberFormat;

/**
 * Just a start and test class for this program. You may modify this class
 * in any way you see fit.
 *
 * @author jlombardo
 */
public class Startup {

    public static void main(String[] args) {
        Employee emp1 = new HourlyEmployee(15.00,40);
        Employee emp2 = new SalariedEmployee(45000, 1250);
        Employee emp3 = new SalariedEmployee(90000,0);
        
        // Create a collection that we can process as a group --
        // demands polymorphic behavior
        Employee[] employees = {emp1, emp2, emp3};

        // High-level module
        HRService hr = new HRService();

        // Just utility code to format numbers nice.
        NumberFormat nf = NumberFormat.getCurrencyInstance();

        // Test input/output by looping over collection in a way that
        // doesn't break if we add/subtract employees from array
        for(int i=0; i < employees.length; i++) {
            System.out.println("Employee " + (i+1) + " Annual Salary:" +
            nf.format(hr.processAnnualSalary(employees[i])));
        }
//        for (Employee e : employees)
//            System.out.println("Employee Annual Salary: " + nf.format(hr.processAnnualSalary(e)));
    }
}
