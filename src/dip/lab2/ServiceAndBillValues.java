/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package dip.lab2;

/**
 *
 * @author mcarpenter5
 */
public abstract class ServiceAndBillValues implements TipStragey {
    private double minBill= 0.00;
    private double maxBill= 100.00;
    private String billErrorEntry =
            "Error: bill must be between " + minBill + " and "
            + maxBill;
    private double goodRate = 0.20;
    private  double fairRate = 0.15;
    private  double poorRate = 0.10;

   
    
    public double getMinBill() {
        return minBill;
    }

    public void setMinBill(double minBill) {
        if ((minBill < 0) && (minBill > maxBill))
            System.out.println("Your min bill must be greater than 0 and less than your max bill default is:" 
                    + " " + getMaxBill());
        this.minBill = minBill;
    }

    public String getBillErrorEntry() {
        return billErrorEntry;
    }

    public void setBillErrorEntry(String billErrorEntry) {
        if(billErrorEntry == null || billErrorEntry.length()< 0)
            System.out.println("Please enter an error message");
        this.billErrorEntry = billErrorEntry;
    }
    public double getMaxBill() {
        return maxBill;
    }

    public void setMaxBill(double maxBill) {
        if (maxBill > minBill)
            System.out.println("Your Max bill must be greater than your min bill default is:" 
                    + " " + getMinBill());
        this.maxBill = maxBill;
    }

    public double getGoodRate() {
        return goodRate;
    }

    public void setGoodRate(double goodRate) {
        if ((goodRate < fairRate))
            System.out.println("Your good rate should be larger than your fair rate which is:" + " " + getFairRate());
        this.goodRate = goodRate;
    }

    public double getFairRate() {
        return fairRate;
    }

    public void setFairRate(double fairRate) {
        if ((fairRate > goodRate) && (fairRate < poorRate))
            System.out.println("Your Fair rate should be less than your greater rate which is:" + " " + getGoodRate() 
                    + "and greater than your poor rate which is:" + " " + getPoorRate());
        this.fairRate = fairRate;
    }

    public double getPoorRate() {
        return poorRate;
    }

    public void setPoorRate(double poorRate) {
        if ((poorRate > fairRate))
            System.out.println("Your poor rate should be less than your fair rate which is:" + " " + getFairRate());
        this.poorRate = poorRate;
    }
    

    

    
    
    
    
}
