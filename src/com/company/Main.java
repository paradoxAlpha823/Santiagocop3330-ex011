/*
 *  UCF COP3330 Fall 2021 Assignment 11 Solution
 *  Copyright 2021 Diego Santiago
 */


package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner x = new Scanner(System.in);
        System.out.print("How many euros are you exchanging? ");
        String s1 = x.nextLine();
        Double num1 = null;
        try {
            num1 = Double.valueOf(s1);

        } catch (NumberFormatException exception) {
            System.out.print("Input only integer or double values please.");
            System.exit(0);
        }
        System.out.print("What is the exchange rate? ");
        String s2 = x.nextLine();
        Double num2 = null;
        try {
            num2 = Double.valueOf(s2);

        } catch (NumberFormatException exception) {
            System.out.print("Input only integer or double values please.");
            System.exit(0);
        }

        double n1 = num1;
        double n2 = num2;
        double usdp = n2*n1*100;
        double usd1 = Math.ceil(usdp);
        double usda = usd1/100;


        System.out.println(n1 + " euros at an exchange rate of " + n2 + " is\r\n" + usda+ " US dollars.");

        System.exit(0);
    }
}
