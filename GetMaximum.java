package com.Generics;

public class GetMaximum {
	public static <T extends Comparable<T>> T maximum(T x, T y, T z) {
        T max = x;
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
	int x = 40, y = 90, z = 70;
	Float xFt = 6.5f, yFt = 7.5f, zFt = 5.5f;
	String xStr = "apple" , yStr = "pear", zStr = "banana";
	maximum(x, y, z);
	maximum(xFt, yFt, zFt);
	maximum(xStr, yStr, zStr);
	}
}
