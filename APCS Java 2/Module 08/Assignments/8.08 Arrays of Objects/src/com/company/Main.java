package com.company;

public class Main {

    public static void main(String[] args) {

        int startMiles[] = {2432, 2697, 2433};

        int endMiles[] = {2697, 2958, 2704};

        double gallons[] = {15, 11.8, 18};
        double gallonSum = 0;
        double annualGallons = 0;

        int distance[] = {265, 261, 271};
        int distanceSum = 0;
        double annualDistance = 0;

        double mpg[] = {22.08333333, 22.11864407, 24.63636364};

        double price[] = {2.11, 2.01, 2.11};
        double priceSum = 0;
        double annualPrice = 0;

        double cost[] = {25.32, 23.718, 23.21};
        double costSum = 0;
        double annualCost = 0;

        int day[] = {1, 4, 7};




        for(int i = 0; i <= 2; i++){

            gallonSum = gallonSum + gallons[i];

            distanceSum = distanceSum + distance[i];

            priceSum = priceSum + price[i];

            costSum = costSum + cost[i];
        }

        annualGallons = gallonSum * 121.333333;

        annualDistance = distanceSum * 121.333333;

        annualPrice = priceSum * 121.333333;

        annualCost = costSum * 121.333333;



        System.out.printf("%s            %s            %s          %s          %s    " +
                "       %s", "startMiles", "endMiles", "distance", "gallons", "mpg", "cost");

        System.out.println("\n ===============================================================" +
                "==========================================================================");

        for(int i = 0; i <= 2; i++) {
            System.out.printf("%d                    %d                %d              %f       %f     " +
                    "%f", startMiles[i], endMiles[i], distance[i], gallons[i], mpg[i], cost[i]);
            System.out.println();
        }

        System.out.println("Totals: \t\t\t\t\t\t\t\t\t" + annualDistance);

    }
}
