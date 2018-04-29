/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package water_meter;

import WMeter.MainFrame;
import WMeter.SError;


/**
 *
 * @author MNB
 */
public class Water_Meter {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args){
        System.out.println("hiiiii..........."); 

        MainFrame mf = new MainFrame();
        mf.setVisible(true);
        SError SE = new SError();
        SE.getdetail();
       
    
    }
}
/*
 
  public static void main(String args[]) throws InterruptedException {
        int countdown = 1;
        while (countdown < 10){
            System.out.println(countdown);
            ++countdown;
            Thread.sleep(1000);
 
 
 */