package dip.lab1;



/**
 * A high-level class that delegates to employee objects to do the work. Does
 * this class design follow the DIP? If not, fix it.
 *
 * @author your name goes here
 */
public class HRService {
public double processAnnualSalary(Employee e) {
        return e.getAnnualWages();
    }
}
