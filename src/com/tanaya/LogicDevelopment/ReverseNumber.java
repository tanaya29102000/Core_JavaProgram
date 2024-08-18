package com.tanaya.LogicDevelopment;

import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        System.out.println(System.in);
        Scanner scanner = new Scanner(System.in);
        int no = Integer.valueOf(scanner.nextLine());

        //input 123 -> rem 3
        //input =12 ->remainder = 2
        //input = 1 -> remainder =1
        // ------------------------------------------
//        int reverseNo = 0;
//        while (no > 0) {
//            //3
//            int remainder = no % 10;
//            no = no / 10;
//            reverseNo = (reverseNo==0)? + remainder :(reverseNo*10) + remainder;
//            System.out.println("reverse no:" + reverseNumber);
            //----------------------------------------------------
        int reverseNumber =0;
        for(int anotherNo =no;anotherNo>0 ; anotherNo =anotherNo/10){
            int remainder = anotherNo % 10;
            reverseNumber =(reverseNumber==0) ? remainder:(reverseNumber*10) +remainder;
            System.out.println("reverse no : "+ reverseNumber);

            }
        System.out.println(reverseNumber);
        }

    }