package com.company;

import java.util.Scanner;
import java.io.File;
import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {

        String token = " ";

	    Scanner inFile = new Scanner(new File("MaleFemaleInFamily.txt"));
        int bCount = 0, gCount = 0, Total = 0;
        while(inFile.hasNext()){
            token = inFile.next();

            for(int i = 0; i < 2; i++)
            {
                switch(token.charAt(i)){
                    case 'G':
                        gCount++;
                        Total++;
                        break;

                    case 'B':
                        bCount++;
                        Total++;
                        break;

                    default:
                        break;
                }
            }
        }
        System.out.println("The sample size is " + Total);
        System.out.println("There were " + bCount + " boys with a probability of " + (((double) bCount)/((double) Total)));
        System.out.println("There were " + gCount + " girls with a probability of " + (((double) gCount)/((double) Total)));
    }

}
