package dip.lab2;

/**
 * An example low-level class. Does this class definition follow the DIP?
 * If not, fix it.
 *
 * Any other best practice violations? Fix them too.
 *
 * @author your name goes here
 */
public class FoodServiceTipCalculator extends ServiceAndBillValues {
    private double bill;
    private ServiceQuality serviceQuality;

       public FoodServiceTipCalculator(ServiceQuality q, double billAmt) {
        this.setServiceRating(q);
        this.setBill(billAmt);
    }

    @Override
    public double getTip() {
        double tip = 0.00; // always initialize local variables

        switch(serviceQuality) {
            case GOOD:
                tip = bill * getGOOD_RATE();
                break;
            case FAIR:
                tip = bill * getFAIR_RATE();
                break;
            case POOR:
                tip = bill * getPOOR_RATE();
                break;
        }

        return tip;
    }

    public void setBill(double billAmt) {
        if(billAmt < getMIN_BILL()) {
            throw new IllegalArgumentException(getBILL_ENTRY_ERR());
        }
        bill = billAmt;
    }

    public  void setServiceRating(ServiceQuality q) {
        // No need to validate because enums provide type safety!
        serviceQuality = q;
    }

    public ServiceQuality getServiceQuality() {
        return serviceQuality;
    }

   
}
