package com.company;

import java.util.ArrayList;

/**
 * Created by MR.JN18 on 12/8/2016.
 */
public class CO2FromElectricity {


        public static double calcAverageBill(ArrayList <Double> monthlyBill){
            return monthlyBill.stream().mapToDouble(a-> a).average().getAsDouble();
        }

        public static double calcAveragePrice(ArrayList <Double>monthlyPrice){
            return monthlyPrice.stream().mapToDouble(a-> a).average().getAsDouble();

        }

}
