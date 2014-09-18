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
    private double MIN_BILL= 0.00;
    private double MAX_BILL= 100.00;
    private String BILL_ENTRY_ERR =
            "Error: bill must be between " + MIN_BILL + " and "
            + MAX_BILL;
    private double GOOD_RATE = 0.20;
    private  double FAIR_RATE = 0.15;
    private  double POOR_RATE = 0.10;

   
    
    public double getMIN_BILL() {
        return MIN_BILL;
    }

    public void setMIN_BILL(double MIN_BILL) {
        if ((MIN_BILL < 0) && (MIN_BILL > MAX_BILL))
            System.out.println("Your min bill must be greater than 0 and less than your max bill default is:" 
                    + " " + getMAX_BILL());
        this.MIN_BILL = MIN_BILL;
    }

    public String getBILL_ENTRY_ERR() {
        return BILL_ENTRY_ERR;
    }

    public void setBILL_ENTRY_ERR(String BILL_ENTRY_ERR) {
        if(BILL_ENTRY_ERR == null || BILL_ENTRY_ERR.length()< 0)
            System.out.println("Please enter an error message");
        this.BILL_ENTRY_ERR = BILL_ENTRY_ERR;
    }
    public double getMAX_BILL() {
        return MAX_BILL;
    }

    public void setMAX_BILL(double MAX_BILL) {
        if (MAX_BILL > MIN_BILL)
            System.out.println("Your Max bill must be greater than your min bill default is:" 
                    + " " + getMIN_BILL());
        this.MAX_BILL = MAX_BILL;
    }

    public double getGOOD_RATE() {
        return GOOD_RATE;
    }

    public void setGOOD_RATE(double GOOD_RATE) {
        if ((GOOD_RATE < FAIR_RATE))
            System.out.println("Your good rate should be larger than your fair rate which is:" + " " + getFAIR_RATE());
        this.GOOD_RATE = GOOD_RATE;
    }

    public double getFAIR_RATE() {
        return FAIR_RATE;
    }

    public void setFAIR_RATE(double FAIR_RATE) {
        if ((FAIR_RATE > GOOD_RATE) && (FAIR_RATE < POOR_RATE))
            System.out.println("Your Fair rate should be less than your greater rate which is:" + " " + getGOOD_RATE() 
                    + "and greater than your poor rate which is:" + " " + getPOOR_RATE());
        this.FAIR_RATE = FAIR_RATE;
    }

    public double getPOOR_RATE() {
        return POOR_RATE;
    }

    public void setPOOR_RATE(double POOR_RATE) {
        if ((POOR_RATE > FAIR_RATE))
            System.out.println("Your poor rate should be less than your fair rate which is:" + " " + getFAIR_RATE());
        this.POOR_RATE = POOR_RATE;
    }
    

    

    
    
    
    
}
