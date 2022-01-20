package com.Generics;

public class GetMaxString {
	 public static String FindMaximum(String x, String y, String z){
		 String max = x;
		 if(y.compareTo(max) > 0) {
			 max = y;
		}
		 if(z.compareTo(max) > 0) {
			 max = z;
		}
		System.out.printf("Max of %s, %s and %s is %s\n",x ,y ,z , max);
		return max;
}
public static void main(String args[]) {
	String x = "Apple" , y = "Banana", z = "Peach";
	FindMaximum(x, y, z);
	}
}


