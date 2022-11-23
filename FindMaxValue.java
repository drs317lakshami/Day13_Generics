package com.bridgelabz.shahazad;

public class FindMaxValue {

    public static Float maxOfInteger(Float Value1, Float Value2, Float Value3){
    	Float max = Value1;
        if (Value2.compareTo(max) > 0)
            max = Value2;
        if (Value3.compareTo(max) > 0)
            max = Value3;
        return max;
    }

    public static void main(String[] args) {
    	
        System.out.println("Welcome To Find Maximun Problem Using Generics \n");
        
        System.out.println("The maximum value between the three integer is : " + maxOfInteger(3.5f, 8.5f, 5.5f));
    }}