package org.example;
import java.util.Scanner;

/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Christian Williams
 */

public class App
{
    public static void main( String[] args )
    {
        Scanner input = new Scanner(System.in);

        System.out.println("How many euros are you exchanging? ");
        double euros = input.nextDouble();
        System.out.println("What is the exchange rate? ");
        double exchangeRate = input.nextDouble();

        double dollars = exchangeRate * euros;
        System.out.println(euros + " euros at an exchange rate of " + exchangeRate + " is\n" +
                String.format("%.2f", dollars) + " U.S. dollars.");
    }
}
