package com.tanaya.operator;

import java.util.Scanner;

public class LessThanOperatorDemo {
    public static void main(String[] args) {
        System.out.println("please enter value:");
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        if (Integer.valueOf(input) < 100) {
            System.out.println("good number");
        } else {
            System.out.println("bad number");

        }
    }
}
