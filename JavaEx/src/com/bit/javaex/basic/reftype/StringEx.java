package com.bit.javaex.basic.reftype;

public class StringEx {
	public static void defineStr(){
		//문자열 선언
		String str; //선언
		str = "Java"; //코드에 입력한 값 : Literal
		String str2 = "Java"; // 리터럴 str과 같은 값
		String str3 = new String("Java");
		
		// ==비교
		System.out.println(str==str2);
		System.out.println(str==str3);
		//참조타입(객체)에서 ==은 객체의 주소비교다(값의 비교 아님)
		
		//값의 비교:Java 모든 객체는 equals라는 값 비교메서드가 있다.
		System.out.println(str.contentEquals(str3));
		
	}
	
	public static void stringFormatEx() {
		//포맛문자에서 %ㅇ,%s
		//string.format 매서드 or system.out.printf
		String fruit = "사과";
		int total =10, eat =3;
		
		System.out.println(total+"개의"+fruit+" 중에서"+eat+"개를 먹었다");
		//가변 데이터 영역을 포맷 문자로 설정하고 고정 역역을 문자열로 설정
		//향후에 포맷 문자에 연결시킬 데이터를 설정
		System.out.printf("%d개의 %s 중에서 %d개를 먹었다.%n", total, fruit, eat);
		
		float rate = 1.2345f;
		//현재 이자율은 1.23%입니다. 출력
		String fmt = "현재 이자율은 %.2f%%입니다.%n";
		//%f의 경우 소수점 자리수를 지정 가능
		//%% -> %로 출력(%가 포맛 지정문자)
		System.out.printf(fmt, rate);
		
		String s = String.format(fmt, 1.5678f);
		System.out.println(s);
	}
	
	public static void main(String[] args) {
		
		//defineStr();
		stringFormatEx();
	}

}
