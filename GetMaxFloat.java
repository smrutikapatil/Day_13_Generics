package com.Generics;

public class GetMaxFloat {
	public static Float FindMaximum(Float x, Float y, Float z) {
		Float  max = x;
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
	Float x = 6.5f, y = 7.5f, z = 5.5f;
	FindMaximum(x, y, z);
	}
}

