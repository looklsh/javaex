package com.bit.javaex.oop.staticmember;
//singleton 예제
//전 체프로그램 내에서 유일하게 한 개의 인스턴스만 유지해야할 경우
public class Singleton {
	static Singleton instance = new Singleton();
	private Singleton() {
		//new 생성 자체 불가
	}
	//상성자가 PRIVATE이므로 NEW로 생성할 수 없으니 INSTANCE를 확보 할 수 있는 메서드가 있어야 함
	public static Singleton getInstance() {
		return instance; //프로그램 전체에서 단일 instance ㅇ유지
		
	}

}
