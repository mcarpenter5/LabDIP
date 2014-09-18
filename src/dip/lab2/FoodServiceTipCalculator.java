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
                tip = bill * getGoodRate();
                break;
            case FAIR:
                tip = bill * getFairRate();
                break;
            case POOR:
                tip = bill * getPoorRate();
                break;
        }

        return tip;
    }

    public void setBill(double billAmt) {
        if(billAmt < getMinBill()) {
            throw new IllegalArgumentException(getBillErrorEntry());
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
