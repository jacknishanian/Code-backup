package com.company;
/**
 * this class calculates my CO2 footprint
 * @author Jack Nishanian
 * @version 12/8/16
 */
public class CO2FootprintV1 {

    double gallons=0;
    double tons=0;
    double pounds=0;


    public void calcTonsCO2(){
        tons = 0.00878*gallons;
    }
    /**
     *
     *  @return this method returns pounds
     *
     */
    public double getPoundsCO2()
    {
        return pounds;
    }

    /**
     *
     * @return this method returns tons
     *
     */

    public double getTonsCO2()
    {
        return tons;
    }


    public void convertTonsToPounds(){
        tons = getTonsCO2();
        pounds = 2000*tons;
    }


    public void convertPoundsToTons()
    {
        tons = pounds/2000;
    }
}
