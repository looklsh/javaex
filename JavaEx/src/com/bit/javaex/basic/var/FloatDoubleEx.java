package com.bit.javaex.basic.var;

public class FloatDoubleEx {

	public static void main(String[] args) {
		// float(4바이트), double(8바이트)
		float floatVal = 3.14159F;
		double doubleVal = 3.14159;
		
		floatVal = 0.12345678901234567890F;
		doubleVal = 0.12345678901234567890;
		
		System.out.println("float:" + floatVal);
		System.out.println("double:" + doubleVal);
		
		System.out.println(0.1 * 3);
		
		//지수표기법
		// 300000
		doubleVal = 3E5;
		System.out.println(doubleVal);

	}//

}//
