package com.bit.javaex.exception;
// 강제 익셉션 발생 연습
//메서드 내에서 예외를 처리 할수 있지만 
//보통은 호출하는 메서드에서 호촐되는 메서드의 예외를 
//일괄 처리하는 것이 보다 좋은 처리 방법

public class ThrowsException {
	//외부에서 호출되는 메서드, 억지로 예외처리를 하지 않고
	//호출한 메서드에 예외처리를 위임
	public void executeRuntimeException() {
		System.out.println("강제 예외발생");
		//RuntimeException을 강제로 발생해봅시다
		throw new RuntimeException("강제 예외");
	}
	
	public double divide(int num1, int num2) {
		if(num2==0) {
			//호출한 메서드로 사용자 정의 exception을 밸생
			// 처리를 위임
			throw new CustomArithException("사용자 정의 예외",num1,num2);
			//num1,num2는 예외 발생 당시 데이터
		}
		return num1/num2;
	}
}
