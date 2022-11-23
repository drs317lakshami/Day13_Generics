package com.bridgelabz.shahazad;

public class FindMaxValue {

    public static Integer maxOfInteger(Integer Value1, Integer Value2, Integer Value3){
        Integer max = Value1;
        if (Value2.compareTo(max) > 0)
            max = Value2;
        if (Value3.compareTo(max) > 0)
            max = Value3;
        return max;
    }

    public static void main(String[] args) {
        System.out.println("Welcome To Find Maximun Problem Using Generics \n");
        
        System.out.println("The maximum value between the three integer is : " + maxOfInteger(3, 8, 5));
    }}