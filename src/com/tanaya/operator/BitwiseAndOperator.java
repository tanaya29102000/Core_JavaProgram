package com.tanaya.operator;

import java.util.Scanner;

//public class BitwiseAndOperator {
//    //attributes or operators
//
//    static int firstNumber =0;
//    static int secondNumber =0;
//
//    private static void BitwiseAndOperator(){
//        int result = firstNumber & secondNumber;
//        System.out.println("bitwise AND result:" + result);
//    }
//    public static void main(String[] args) {
//        System.out.println("please enter 2 value:");
//        Scanner scanner = new Scanner(System.in);
//firstNumber = Integer.valueOf(scanner.nextLine());
//secondNumber = Integer.valueOf(scanner.nextLine());
//        BitwiseAndOperator();
//
//    }
//}

public class BitwiseAndOperator {
    //attributes or operators

    static int firstNumber =0;
    static int secondNumber =0;

    private static void BitwiseAndOperator(){
        int result = firstNumber & secondNumber;
        System.out.println("bitwise OR result:" + result);
    }
    public static void main(String[] args) {
        System.out.println("please enter 2 value:");
        Scanner scanner = new Scanner(System.in);
        firstNumber = Integer.valueOf(scanner.nextLine());
        secondNumber = Integer.valueOf(scanner.nextLine());
        BitwiseAndOperator();

    }
}
