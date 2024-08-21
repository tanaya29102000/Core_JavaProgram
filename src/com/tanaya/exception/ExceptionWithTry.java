package com.tanaya.exception;

import java.util.Scanner;
//Exception Handling program with try catch
public class ExceptionWithTry {
    public static void main(String[] args){
        System.out.println("please enter 2 values");
        Scanner scanner= new Scanner(System.in);
        String firstInput =scanner.nextLine();
        String secondInput =scanner.nextLine();
        try{
            int no1 =Integer.valueOf(firstInput);
            int no2 = Integer.valueOf(secondInput);
            System.out.println("Division:"+(no1/no2));
        }catch(NumberFormatException exception){
            System.out.println("entered values are not numbers.");

        }


    }
}