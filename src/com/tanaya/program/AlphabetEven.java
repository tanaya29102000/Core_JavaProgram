package com.tanaya.program;

public class AlphabetEven {
//not working
    public static void main(String[] args){
        char Start ='A';
        while (Start <='Z') {
            if (Start % 10 == 0) {
                System.out.print(+(int) Start + "ascii value of" + Start);
                {
                    Start++;
                }

            }
        }


    }
}
