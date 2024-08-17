package com.tanaya.loop;

public class EndlessWhileLoop {
    private void printNo(int no){
        System.out.println("no we recieved is: " + no);
    }
    public static void main(String[] args){
        EndlessWhileLoop loopClass = new EndlessWhileLoop();
        int no = 10;

        while(no >= 10){
            loopClass.printNo(--no);//print the no.using loop;
        }
    }
}
