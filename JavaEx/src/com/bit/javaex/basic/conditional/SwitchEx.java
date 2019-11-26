package com.bit.javaex.basic.conditional;

import java.util.Scanner;

public class SwitchEx {

	public static void main(String[] args) {
		//switchEx1();
		//switchEx2();
		switchEx3();

	}//
	public static void switchEx3() {
		
		Scanner scanner = new Scanner(System.in);
		String dow = "WED";
		//월 휴식
		//화수목 열공
		//금 불금
		//토 방전
		
		
		//노트: 코드값을 만들고자 할때 문자열로 설정하는 것은 바람직하지 않다
		//이럴경우 상수 혹은 ENUM 타입을 활용해서
		//데이터의 범위를 강제하거나 축소해야한다
		//이 메서드의 코드는 나중에 ENUM 타입으로 바꿔볼거임
		String message;
		
		switch(dow) {
		case "MON":
		case "TUE":
		case "WED":
		case "THU":
			message = "열공";
			break;
		case "FRI":
			message= "불금";
			break;
		case "SAT":
			message = "방전";
			break;
		case "SUN":
			message = "휴식";
			break;
		default:
			message = "여긴 어디지?";
		}
		System.out.println(message);
		scanner.close();
	}
	public static void switchEx1() {
		//일반적인 sitch ~ case 문 사용법
		// 과목을 입력받아서
		//과목별 강의실을 출력
		
		Scanner scanner = new Scanner(System.in);
				System.out.println("1:C, 2:C++, 3:Java");
				System.out.print("과목명:");
				int subject = scanner.nextInt();
				
				//sitch는 조건 판별이아니라 값의 판별
				String message;
				
				switch(subject) {
				case 1:
					message = "R101";
					break;
				case 2:
					message = "R102";
					break;
				case 3:
					message = "R103";
					break;
				default:
					message = "문의 바람";
				}
				System.out.println(message);
				
				scanner.close();
	}
	
}//
