package com.bit.javaex.basic.oper;

public class BitOperEx {

	public static void main(String[] args) {
		// 비트 연산
		// 하드웨어 제어, 이미지 프로세싱
		// 미세한 단위 데이터를 제어할 때 사용
		// &AND, |OR, ~NOT
		byte b1 = 0b1101;
		byte b2 = 0b0111;
		
		int result = b1 & b2;
	
		System.out.println("b1 and b2:" + Integer.toBinaryString(result));
		
		result = b1 | b2;
		
		System.out.println("b1 or b2:" + Integer.toBinaryString(result));
		
		result = ~b1;
		System.out.println("not b1:" + Integer.toBinaryString(result));
		
		//비트 시프트
		// <<왼쪽, >>오른쪽
		int val = 1;
		System.out.println(val);
		// val을 왼쪽으로 1비트 이동해보자
		System.out.println(Integer.toBinaryString(val << 1));
		// val을 왼쪽으로 4비트 이동
		System.out.println(Integer.toBinaryString(val << 4));
		
		// 우측 시프트
		int val2 = 0b1000;
		System.out.println(Integer.toBinaryString(val2));
		System.out.println(Integer.toBinaryString(val2 << 1));
		
		
		
		
		

	}

}
