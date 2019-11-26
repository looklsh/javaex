package com.bit.javaex.api.wrapper;

public class WrapperEx {

	public static void main(String[] args) {
		
		//Wrapper 클래스(포장 클래스)
		//자바는 기본적으로 객체를 다루는 언어여서
		//경우에 따라 객체가 아니면 사용할 수없는 메서드들이 다수
		//이런 메서드의 경우 기본 타입을 직접 사용할 수 없고
		//포장 클래스로 포장해서 넘겨줘야 한다
		Integer i= new Integer(10);
		Character c= new Character('c');
		//new를 이용한 wrapper클래스의 새성은 9에서 deprecated됨
		//앞으로는 valueof
		Float f=Float.valueOf(3.14159f);
		Boolean b= Boolean.valueOf(true);
		
		//valueOf의 경우 문자열로 넣어도됨
		Integer i2=Integer.valueOf("10");
		Double d2=Double.valueOf("3.14159");
		//중요:VALUEOF 에 넘겨준 문자열이 해당 자료형의 형태여야함
//		Integer i3=Integer.valueOf("a123"); //a123은 정수 형태가 아니다
		
		//변환관련 메서드들: parse 계열의 메서드
		//   문자열을 해당 데이터의 타입으로 변경, 혹은 다른 형태로 출력
		System.out.println(Integer.parseInt("-123")); //문자열을 정수로
		System.out.println(Integer.parseInt("FF",16)); //ff 16진수를 정수로 변경
		
		System.out.println(Integer.toBinaryString(2019)); //2진수 문자열
		System.out.println(Integer.toHexString(2019)); //16진수 문자열
		
		//형변환
		double d3=i2.doubleValue(); //정수 i2를 double로 변경
		
		//박싱과 언박싱
		Integer i3=2019; //5이후에는 자동으로 박싱
		
		//언박싱
		System.out.println(i3.intValue());

	}

}
