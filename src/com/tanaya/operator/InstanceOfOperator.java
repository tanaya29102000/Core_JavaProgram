package com.tanaya.operator;

import java.awt.geom.QuadCurve2D;

public class InstanceOfOperator {
    public static void main(String []args){
        String city ="Nagpur";
        Integer length =23;
        Double temparature = 36.5;

        if (city instanceof String){
            System.out.println("type of city is string");
        }else{
            System.out.println("type of city is not string");
        }

        if (length instanceof Integer){
            System.out.println("type of city is integer");
        }else{
            System.out.println("type of city is not integer");
        }

        if (temparature instanceof Double){
            System.out.println("type of city is double");
        }else{
            System.out.println("type of city is not double");
        }
    }
}
