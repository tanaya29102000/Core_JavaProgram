package com.tanaya.loop;

public class Array {

    public static void main(String[] args) {
        int marks[] = new int[5];
        marks[0] = 45;
        marks[1] = 57;
        marks[2] = 98;
        marks[3] = 38;
        marks[4] = 76;

        System.out.println("Size of array: "+marks.length);
        int position =0;
        while (position < marks.length) {
            System.out.println(marks[position]);
            position++;

        }
    }
}