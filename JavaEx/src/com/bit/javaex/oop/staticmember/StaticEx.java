package com.bit.javaex.oop.staticmember;

//멤버의 범위 확인
public class StaticEx {
	//static과 instance 변수는 클래스 영역에 선언
	public static int refCount; // 클랫 변수(인스턴스화 하지 않아도 접근 가능)
	public static String  classVar; //클래스변수
	//STATIC 메서드 안쪽에서는 STATIC 멤버만 접근 가능	
	
	public String instanceVar; 
	//instance 변수는 생성된 개별 인스턴스 내부에서만 활용가능
	//instance 변수는 static 멤버에서는 확인할 수 없다
	
	static {
		//클래스 변수의 초기화
		//해당 클래스가 최초 사용될 때 한번 실행 되고 이후 프로그램 종료시 해제
		
		 refCount=0;
		 classVar="Static Member";
		 System.out.println("-----Static Block");
//		 instanceVar="Instance Var"; //에러
	}
	
	//생성자: 인스턴스 멤버 초기화 담당
	public StaticEx() {
		 refCount++; //static변수이므로 어디서든 접근 가능
		 System.out.println("참고 갯수: " +  refCount);
		 System.out.println("-----Instance 생성");
		
		 
		// 소멸자: 인스턴스 소멸시 정리작업 담당
//			protected void finalize() throws Throwable{
//				
//			}
	}
	
	

}
