package dip.lab1;

/**
 * A simple implementation sub-class of Employee. These are low-level classes
 * in the DIP. Does it meet the rules of DIP? If not fix it.
 *
 * @author your name goes here
 */
public class SalariedEmployee implements Employee {
private double annualSalary;
private double annualRaise;

    public SalariedEmployee(double annualSalary, double annualRaise) {
        this.annualSalary = annualSalary;
        this.annualRaise = annualRaise;
    }

    public SalariedEmployee() {
    }

    public double getAnnualSalary() {
        return annualSalary;
    }

    public void setAnnualSalary(double annualSalary) {
        this.annualSalary = annualSalary;
    }

    public double getAnnualRaise() {
        return annualRaise;
    }

    public void setAnnualRaise(double annualRaise) {
        this.annualRaise = annualRaise;
    }

    @Override
    public double getWages() {
    return annualSalary;
    }


   

    
}
