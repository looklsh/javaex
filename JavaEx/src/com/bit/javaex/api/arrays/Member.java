package com.bit.javaex.api.arrays;

//사용자 정의 클래슷 정렬하기 위해서는 COMPARABLE 인터페이스를 구현해줘야함
public class Member implements Comparable{
	//필드
	String name;
	
	//생성자
	public Member(String name) {
		this.name=name;
	}

	@Override
	public String toString() {
		return "Member [name=" + name + "]";
	}

	@Override
	public int compareTo(Object o) {
		//두 개의 객체를 비교하기 위해서 compareto 메서드에 비교방법을 기술해줘야함
		//name필드를 대상으로 대소 비교
		if(o instanceof Member) {
			//다운 캐스팅 가능
			Member other=(Member)o;
			return name.compareTo(other.name);
			// -1,0,1
			//비교대상이 동일하면 0
			//비교대상이 작으면 -1
			//비교대상이 크면 1
		}
		return 0;
	}
	
	
}
