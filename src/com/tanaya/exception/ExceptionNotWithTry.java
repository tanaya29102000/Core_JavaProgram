package com.tanaya.exception;

import java.util.Scanner;
//Exception Handling program
public class ExceptionNotWithTry {
    public static void main(String[] args){
        System.out.println("please enter 2 values");
        Scanner scanner= new Scanner(System.in);
        String firstInput =scanner.nextLine();
        String secondInput =scanner.nextLine();


        int no1 =Integer.valueOf(firstInput);
        int no2 = Integer.valueOf(secondInput);
    }
}
