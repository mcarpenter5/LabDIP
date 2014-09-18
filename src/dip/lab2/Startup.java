package dip.lab2;



/**
 * Just a test class for input and output.
 *
 * 1. Create instances of low-level classes using Liskov Substitution principle.
 * 2. Create an instance of your high-level class.
 * 3. Pass one of your calculator instances to the high-level class and
 *    check the results.
 * 4. Now switch to a different calculator instance and pass that to the
 *    high-level class. Did it work? Are the low-level instances
 *    interchangeable? The DIP requires this.
 * 
 * @author your name goes here
 */
public class Startup {
   
 
    public static void main(String[] args) {
    //TipStragey tip = new BaggageServiceTipCalculator(ServiceQuality.GOOD,6);
    TipStragey tip = new FoodServiceTipCalculator(ServiceQuality.GOOD,6.00);
    
    TipManager mg = new TipManager(tip);
    System.out.println(mg.processTip());
    
    }

}
