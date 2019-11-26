package com.bit.javaex.exception;
//사용자 정의 예외 생성
//예외 발생시의 데이터를 담아서
//CATCH블록에서 어떤 데이터가 오류를 발생시켰는지 확인해볼수 있다
public class CustomArithException 
	extends ArithmeticException {
	//필드:오류상황에서 밸생한 데이터를 적재
	private int num1;
	private int num2;
	//생성자
	public CustomArithException(String message, int num1, int num2) {
		super(message);
		this.num1=num1;
		this.num2=num2;
		
	}
	// getters
	public int getNum1() {
		return num1;
	}
	public int getNum2() {
		return num2;

}
	
	
}
