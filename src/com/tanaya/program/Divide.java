package com.tanaya.program;

import java.util.Scanner;

public class Divide {
    //Write a java program to divide two numbers and print them on the screen.
    public static void main(String[] args){
        //create a scanner object to reaf input from the user
        Scanner input = new Scanner(System.in);

        //prompt the uset to input the first no
        System.out.print("input the first no:");

        //read and store the first no
        int a = input.nextInt();

        //prompt the uset to input the second no
        System.out.print("input the second no:");

        //read and store the second no
        int b = input.nextInt();

        //calculate the division of a and b
        int d = (a/b);

        //display a blank line for separation
        System.out.println();

        //display the result of the division
        System.out.println("the division of a and b is:" + d);
    }
}
