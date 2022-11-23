package com.bridgelabz.shahazad;

public class FindMaximum<T extends Comparable<T>> {

	// Class Based Variables
	T Value1, Value2, Value3;

	// Created Generic Method
	public static <T extends Comparable<T>> T maxOfValues(T Value1, T Value2, T Value3) {
		T max = Value1;
		if (Value2.compareTo(max) > 0)
			max = Value2;
		if (Value3.compareTo(max) > 0)
			max = Value3;
		return max;
	}

	public static void main(String[] args) {

		System.out.println("Welcome To Find Maximun Problem Using Generics \n");
		System.out.println("The maximum value between the three integer is : " + maxOfValues(3, 8, 5) + "\n");
		System.out.println("The maximum value between the three float is : " + maxOfValues(1.5f, 3.56f, 5.87f) + "\n");
		System.out.println("The maximum value between the three string is : " + maxOfValues("abc", "pqr", "xyz"));

	}

}