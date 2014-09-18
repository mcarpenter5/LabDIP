package dip.lab1;

/**
 * An implementation sub-class of an Employee. These are low-level classes
 * in the DIP. Does it meet the rules of DIP? If not fix it.
 *
 * @author your name goes here
 */
public class HourlyEmployee implements Employee {
    
    /** default constructor. Is this the best way to go? */
    private double hourlyRate;
    private double hoursPerWeek;

    public HourlyEmployee(double hourlyrate, double hoursPerWeek) {
        this.hourlyRate = hourlyrate;
        this.hoursPerWeek = hoursPerWeek;
    }

    public HourlyEmployee() {
    }

    public double getHourlyrate() {
        return hourlyRate;
    }

    public void setHourlyrate(double hourlyrate) {
        this.hourlyRate = hourlyrate;
    }

    public double getHoursPerWeek() {
        return hoursPerWeek;
    }

    public void setHoursPerWeek(double hoursPerWeek) {
        this.hoursPerWeek = hoursPerWeek;
    }

    @Override
    public double getWages() {
    return hourlyRate * hoursPerWeek;
    
    
    
    }
    



}
