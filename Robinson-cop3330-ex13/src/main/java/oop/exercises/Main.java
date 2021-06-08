package oop.exercises;
import java.util.Scanner;
/*
 * UCF cop3330 Summer 2021 Assignment 1 solutions
 * Copyright 2021 Keondez Robinson
 */
public class Main
{
    public static void main(String[] args)
    {
        int years, times;
        double principal, rate, interest;
        Scanner input;

        input = new Scanner(System.in);

        System.out.print("What is the principal amount? ");
        principal =  input.nextDouble();
        System.out.print("What is the rate? ");
        rate = input.nextDouble();
        System.out.print("What is the number of year? ");
        years = input.nextInt();
        System.out.print("What is the number of times the interest is compounded? ");
        times = input.nextInt();

        interest = principal * Math.pow((1 + ((rate / 100) / times)), (years * times));
        System.out.printf("$%.2f invested at %.2f%% for %d years compounded " +
                "%d times will be $%.2f.\n", principal, rate, years, times, interest);
    }
}