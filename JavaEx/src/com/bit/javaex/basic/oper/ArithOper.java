package com.bit.javaex.basic.oper;

import java.util.Scanner;

public class ArithOper {

	public static void main(String[] args) {
		int a = 7;
		int b = 3;
		
		System.out.println(-a);
		System.out.println(-1 * a);
		
		
		System.out.println("정수의 나눗셈: " + (a / b));
		
		System.out.println("나머지:" + (a % b));
		
		System.out.println("나눗셈의 해:" + ((float)a / (float)b));
		System.out.println("나눗셈의 해:" + ((float)a / b));
		
		//증감연산자: ++,--
		//연산 순서에 유의, a++와 ++a는 다르다
		System.out.println("A: " + a);
		System.out.println("++a:" + (++a));
		System.out.println("a:" + a);
		
		System.out.println("b:" + b);
		System.out.println("b++:" + (b++));
		System.out.println("b:" + b);
		// 증감 연산자가 다은 연산식에 포함되어 있을 경우
		// 가독성이 매우 떨어지므로 가급적 독립적으로 사용
		
		//나눗셈 보충
		//정수를 0으로 나누기
//		System.out.println(4 / 0);
		//실수를 0으로 나누기
		System.out.println(4.0 / 0);
		
		//경우에 따라서는 피연산자 값이 인피니티인지 체크해야할 경우
		System.out.println(Double.isInfinite(4.0 / 0)); //무한대인지 체크
		System.out.println(Double.isNaN(4.0 / 0));
		// Infinity는 수치 값이다.
		
		


	}//

}//
