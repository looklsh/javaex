package com.bit.javaex.basic.var;

public class ImplicitCastingEX {

	public static void main(String[] args) {
		// 암묵적 캐스팅
		//표현범위가 좁은 데이터를 넓은 데이터로 변경할 때
		//java가 자동으로 캐스팅 해줌
		
		byte b =25;
		System.out.println("BYTE: " + b);
		
		short s = b;
		//b는 1바이트라 short할당 가능
		System.out.println("SHORT: " + s);
		
		int i = s;
		System.out.println(i);
		
		long l = i; //8바이트
		System.out.println(l);
		
		
		float f = l; //4바이트
		// 바이트 수는 long보다 작지만 범위가 넓으므로 암묵적 캐스팅이 가능
		System.out.println(f);
		
		
		char ch = 'A';
		//short s2 = ch;
		int i2 = ch;

	}//

}//
