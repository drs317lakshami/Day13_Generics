package com.bridgelabz.shahazad;

public class FindMaxValue {
	

	public static String toFindMax(String  String1,String String2,String String3) {
		
		String max = String1;
		if (String2.compareTo(max) > 0 ) {
			max = String2;
		}
		if (String3.compareTo(max) > 0) {
			max = String3;
		}
		
		return max;
		
	}

	public static void main(String[] args) {
		
		FindMaxValue maximum = new FindMaxValue();
		System.out.println("Maximum of among 3 Values is "+toFindMax("Apple", "Peach", "Banana"));

	}

}