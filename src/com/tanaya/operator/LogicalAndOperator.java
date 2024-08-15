package com.tanaya.operator;

import java.util.Scanner;

public class LogicalAndOperator {
    public static void main(String[] args){
        System.out.println("please enter value:");
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        if(Integer.valueOf(input) > 0 && Integer.valueOf(input)< 1000) {
            System.out.println("i am a good girl");

        }else{
            System.out.println("i am not good girl");
        }
    }
}
