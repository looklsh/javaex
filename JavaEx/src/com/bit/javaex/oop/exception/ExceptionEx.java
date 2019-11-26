package com.bit.javaex.oop.exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionEx {
	//A
	public static void ArithExceptionEx() {
		//상황1
		//스캐너로부터 점수를 입력 받아서 
		//해당정수로 100을 나눔
		double result=0;
		Scanner scanner =new Scanner(System.in);
		int num=0; //입력값 변수
		try {
			
		
		//오류발생 가능영역
		System.out.print("정수 입력해주세요: ");
		num=scanner.nextInt(); //점수 입력받음
		result= 100/num;
		
		System.out.println("결과: "+ result);
		//오류발생 가능 역역 끝
		}catch (InputMismatchException e) {
			System.out.println("정수로 해주세요!");
		}catch(ArithmeticException e) {
			System.out.println("0으로 나눌수 없어요!:");
			System.out.println("ERROR 메시지:"+ e.getMessage());
		}catch(Exception e) {
			//Exception catch 블록은 맨 마지막에 위치
			//   Exception 클래스는 모든 예외를 다 처리하기 때문
			e.printStackTrace();
		}finally {
			System.out.println("Finally 실행");
		}
		scanner.close();
		
		
	}
	
	public static void arrayExceptionEx() {
		//
		int intArray[]= {3,6,9};
		//intArray lengh ==3
		// 0~2
		System.out.println("길이: "+ intArray.length);
		try {
			
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Error: 인덱스 범위는"+(intArray.length-1) + "까지입니다.");
			System.out.println(e.getMessage());
		}
		intArray[4]=12;
	}
	public static void main(String[] args) {
//		ArithExceptionEx();
		 arrayExceptionEx();

	}

}
