package com.chap_2.datatypes;

/**
 * Datatypes - predefined keywords used to allocate memory for the program data
 * Java supports 8 different datatypes and each one has a predefined range
 * <ul>
 * 	<li>byte</li>
 * 	<li>short</li>
 * 	<li>int</li>
 * 	<li>long</li>
 * 	<li>float</li>
 * 	<li>double</li>
 * 	<li>char</li>
 * 	<li>boolean</li>
 * </ul>
 * 
 * @author Raja Asthana
 * @since 6-Jan-2017
 */
public class DataTypes {
	public static void main(String[] args) {
		byte b = 5;
		short s = 15;
		int i = 123;
		long l = 123456;
		float f = 10.25f;
		double d = 3.1456889848; //for more precision use double instead of float
		char c = 'A';
		boolean bool = true; //true or false
		
		System.out.println(b);//5
		System.out.println(s); //15
		System.out.println(i); //123
		System.out.println(l); //123456
		System.out.println(f); //10.25
		System.out.println(d); //3.1456889848
		System.out.println(c); //A
		System.out.println(bool); //true
	}
}
