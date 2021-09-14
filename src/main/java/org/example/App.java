 /*
  *  UCF COP3330 Fall 2021 Assignment 13 Solution
  *  Copyright 2021 Blake Baez
  */
 package org.example;
import java.util.Scanner;
import java.text.NumberFormat;
import java.util.Locale;

public class App 
{
        public static void main(String[] args) {
            double principal;
            double interest;
            double years;
            double compoundTime;

            Scanner scan = new Scanner(System.in);
            System.out.print("What is the principal amount? ");
            principal = scan.nextDouble();

            System.out.print("What is the rate? ");
            interest = scan.nextDouble();

            System.out.print("What is the number of years? ");
            years = scan.nextDouble();

            System.out.print("What is the number of times the interest is compounded per year? ");
            compoundTime = scan.nextDouble();

            double first = (1 + (interest / 100 / compoundTime));
            double second = (compoundTime * years);
            double investment = principal * Math.pow(first,second);

            double total = Math.round(investment * 100.0) / 100.0;

            System.out.println(NumberFormat.getCurrencyInstance(new Locale("en", "US")).format(principal) + " invested at " + interest + "% for " + years + " years compounded " + compoundTime + " times per year is " + NumberFormat.getCurrencyInstance(new Locale("en", "US")).format(total) + ".");

        }
    }