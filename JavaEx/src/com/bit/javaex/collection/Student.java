package com.bit.javaex.collection;

public class Student {
	//필드
	private String name;
	private int id;
	
	//생성자
	public Student(String name, int id) {
		this.name=name;
		this.id=id;
		
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", id=" + id + "]";
	}

	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Student) {// obj가 Student의 객체인지 확인
			Student other=(Student)obj; //다운 캐스팅
			return name.equals(other.name) && id == other.id;
		}
		return super.equals(obj);
	}

	@Override
	public int hashCode() {
		// 객체를 식별하는 정수 숫자
		//객체를 빠르게 검색하기 위한 코드값
		//만약에 둗 객체의 해쉬코드가 다르다면 다른 객체
		//해쉬코드가 일치할 경우는 내부 값을 추가로 비교한다(equals)
		return id;
	}
	

}
