package com.bit.javaex.basic.conditional;

import java.util.Scanner;

public class switchEx2 {

	public static void main(String[] args) {
		
		String dow = "WED";
		//월 휴식
		//화수목 열공
		//금 불금
		//토 방전
		
		
		//노트: 코드값을 만들고자 할때 문자열로 설정하는 것은 바람직하지 않다
		//이럴경우 상수 혹은 ENUM 타입을 활용해서
		//데이터의 범위를 강제하거나 축소해야한다
		//이 메서드의 코드는 나중에 ENUM 타입으로 바꿔볼거임
		Scanner scanner = new Scanner(System.in);
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
	}//

	}//

