package com.company;

import java.util.Scanner;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
	    Scanner myScanner = new Scanner(System.in);
        Random r = new Random();
        String password = "";

        while(true)
        {
            System.out.print("\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b");
            System.out.println("[1] Lowercase letters ");
            System.out.println("[2] Lowercase and numbers");
            System.out.println("[3] lowercase, uppercase and numbers");
            System.out.println("[4] Uppercase, lowercase, Numbers and Punctuation ");
            System.out.println("[5] Quit");

            String choice = myScanner.next();

            System.out.println("How long would you like the password to be?");
            String length = myScanner.next();

            password = "";
            try
            {
                int c = Integer.parseInt(choice) - 1;
                int len = Integer.parseInt(length);

                if(c < 0 || c > 4 || len < 6)
                    System.out.println("Invalid entry");
                else
                {
                    switch(c)
                    {
                        case 4:
                            return;

                        default:
                            for(int i = 0; i < len; i++)
                            {
                                int rand = 0;
                                if(c == 0)
                                    rand = 0;
                                else
                                    rand = r.nextInt(c+1);
                                switch(rand)
                                {
                                    case 0:
                                        password += (char)(r.nextInt(26) + 'a');
                                        break;
                                    case 1:
                                        password += (char) (r.nextInt(9) + '0');
                                        break;
                                    case 2:
                                        password += (char) (r.nextInt(26) + 'A');
                                    case 3:
                                        int character = r.nextInt(22);

                                        if(character > 15)
                                        {
                                            character -= 16;
                                            password += (char) (character + ':');
                                        }
                                        else
                                        {
                                            password += (char) (character + '!');
                                        }
                                }
                            }
                            System.out.println("Password: " + password);
                            break;
                    }
                }
            }
            catch(Exception ex)
            {

                System.out.println("Invalid entry");
            }

        }



    }
}
