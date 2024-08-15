package com.tanaya.operator;

public class EndlessWhileLoop {

    private void printNo(int no){
        System.out.println("no we received is: " + no);
    }
    public static void main(String[] args) {
        EndlessWhileLoop loopClass = new EndlessWhileLoop();
        while(true) {
            loopClass.printNo(10);
        }
    }
}
