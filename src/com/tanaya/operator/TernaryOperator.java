package com.tanaya.operator;

import java.util.Scanner;

public class TernaryOperator {
    //pseudo code:
    //accept the no as input;
    //check if no is less than 0 -> print negative no
    //else -> positve one.
    public static void main(String[] args){
        System.out.println("please enter value");
        Scanner scanner = new Scanner(System.in);
        int input = Integer.valueOf(scanner.nextLine());

        if (input<0){
            System.out.println("negative no.");

        }else{
            System.out.println("positive no.");
        }
//ternary operator
        System.out.println((input < 0) ? "negative no." : "positive no.");
    }
}
