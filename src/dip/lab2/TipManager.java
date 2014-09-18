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
public class TipManager {
    private TipStragey t;

    public TipManager(TipStragey t) {
        this.t = t;
    }

       public double processTip(){
       double tip = t.getTip();
       return tip;
    }

    
}
