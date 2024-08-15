package com.tanaya.operator;

import java.util.Scanner;

public class LeftShiftOperator {
    //pseudo code to left shift opeator

    public static void main(String[] args){
        System.out.println("please enter value:");
        Scanner scanner = new Scanner(System.in);
        int input = Integer.valueOf((scanner.nextLine()));
        System.out.println("result:" +(input<<4));
    }
}
