package com.bit.javaex.oop.staticmember;

public class CalculatorApp {

	public static void main(String[] args) {
		//static 멤버의 활용
		//static 멤버는 new 없어도 접근가능
		//특정 클래스에 상수, static 메서드를 직접이용할 수있다
		double area=10*10*Calculator.PI;
		double total=Calculator.getsum(1,2,3,4,5,6,7);
		
		

	}

}
