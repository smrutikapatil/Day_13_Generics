package com.Generics;

public class MaximumTest<T extends Comparable<T>> {
	T x, y, z;
public MaximumTest(T x, T y, T z) {
	this.x = x;
	this.y = y;
	this.z = z;
}
public T maximum() {
	return MaximumTest.maximum(x, y, z);
}
public static <T extends Comparable<T>> T maximum(T x, T y, T z) {
	T max = x;
	if(y.compareTo(max) > 0) {
	max = y;
	}
	if(z.compareTo(max) > 0) {
	max = z;
	}
	System.out.printf("Max of %s, %s and %s is %s\n", x , y , z , max);
	return max;
}
public static String maximum(String x, String y, String z) {
	String max = x;
	if (y.compareTo(max) > 0) {
		max = y;
	}
	if (z.compareTo(max) > 0) {
		max = z;
        }
	System.out.printf("Max of %s, %s and %s is %s\n", x, y, z, max);
	return max;
 }
public static void main(String args[]) {
	Integer xInt = 40, yInt = 90, zInt = 70;
	Float xF1 = 6.5f, yF1 = 7.5f, zF1 = 5.5f;
	String xStr = "apple" , yStr = "pear", zStr = "banana";
	
	new MaximumTest(xInt, yInt, zInt).maximum();
	new MaximumTest(xF1, yF1, zF1).maximum();
	new MaximumTest(xStr, yStr, zStr).maximum();
	}
}
