package com.tanaya.exception;

import java.util.Scanner;
//Exception Handling program with throws
public class ExceptionWithThrow {
    public static void division() throws NumberFormatException {
        System.out.println("please enter 2 values");
        Scanner scanner = new Scanner(System.in);
        String firstInput = scanner.nextLine();
        String secondInput = scanner.nextLine();


        int no1 = Integer.valueOf(firstInput);
        int no2 = Integer.valueOf(secondInput);

        System.out.println("Division:"+no1/no2);

    }

    public static void process() {
        try {
            division();
        }catch (NumberFormatException ex) {
            System.out.println(ex.getMessage());
        }
        }
        public static void main (String[]args){
            process();
        }
    }

