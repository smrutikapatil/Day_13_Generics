package com.Generics;

public class GetMaxInteger {
	public static Integer FindMaximum(Integer x, Integer y, Integer z) {
		Integer  max = x;
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
	int x = 40, y = 80, z = 70;
	FindMaximum(x, y, z);    
	}
}
