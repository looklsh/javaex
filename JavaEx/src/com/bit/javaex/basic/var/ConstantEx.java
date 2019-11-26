package com.bit.javaex.basic.var;

public class ConstantEx {
            //상수 static final
	        // final은 재할당 불가
	static final double PI = 3.14159;
	
	
	static final int SPEED_LIMIT = 100;
	
	
	public static void main(String[] args) {
		
		System.out.println(PI);
        System.out.println(SPEED_LIMIT);
        //1. 가독성
        //2. 동일 값 일괄 관리 가능
        
        
       System.out.println("현재 재한 속도는 " + SPEED_LIMIT + "입니다.");
       //SPEED_LIMIT = 120;
       //final은 변경할 수 없다
       
       System.out.println(SPEED_LIMIT + "이하로 주행해주십시오.");
       
       // java는 상수를 많이 활용합니다
       System.out.println(Math.PI); // 내장 Math 객체의 상수
	}//

}//
