package com.tanaya.program;

import java.util.Scanner;

public class Sum {
    //Write a java program to, print the sum of two numbers.
    public static void main(String[] args)
    {
        //create a scanner object to read inputfrom the user
        Scanner input = new Scanner(System.in);

        //prompt the user to input the first number
        System.out.print("Input the first number:");

        //Read and store the first number
        int num1 = input.nextInt();

        //prompt the user to input the second number
        System.out.print("Input the second number:");

        //Read and store the second number
        int num2 = input.nextInt();

        //calculate the sum of the two numbers
        int sum=num1 + num2;

        //Display a blank line for separation
        System.out.println("Sum:" + sum);


    }
}
